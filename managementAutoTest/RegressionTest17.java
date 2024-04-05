package managementAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str12 = managementClient5.getType();
        java.lang.String str13 = managementClient5.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
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
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient17);
        // The following exception was thrown during execution in test generation
        try {
            managementClient18.register("management", "hi!");
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
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        java.lang.String str11 = managementClient8.getType();
        java.lang.Class<?> wildcardClass12 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
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
            managementClient9.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
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
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient12.getPassword("");
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
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient8.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
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
        java.lang.String str10 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
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
            managementClient10.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass9 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
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
        java.lang.String str16 = managementClient12.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        java.lang.String str9 = managementClient5.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "");
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
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
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
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
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
        java.lang.String str15 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
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
        java.lang.Class<?> wildcardClass13 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient4.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
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
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient8.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
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
        java.lang.String str10 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str12 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
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
        java.lang.String str11 = managementClient5.getType();
        java.lang.String str12 = managementClient5.getType();
        java.lang.String str13 = managementClient5.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
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
        java.lang.String str15 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
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
        java.lang.String str11 = managementClient6.getType();
        java.lang.String str12 = managementClient6.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient6.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!", "management");
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
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        java.lang.String str18 = managementClient17.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management", "management");
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
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
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
        java.lang.Class<?> wildcardClass15 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
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
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
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
        java.lang.String str10 = managementClient6.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient(client0);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
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
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "management");
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
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str11 = managementClient10.getType();
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass9 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("hi!", "", "hi!");
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
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
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
        java.lang.String str12 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
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
            managementClient13.register("management", "management");
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
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient4);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "hi!", "");
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
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        java.lang.String str3 = managementClient1.getType();
        java.lang.String str4 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str12 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
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
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
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
        java.lang.String str13 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
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
            java.lang.String str16 = managementClient12.getPassword("");
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
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
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
        java.lang.String str11 = managementClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient14.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
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
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "management");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient6.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
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
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
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
        java.lang.String str12 = managementClient8.getType();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient1.getType();
        java.lang.String str9 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management", "");
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
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
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
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        java.lang.String str9 = managementClient5.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient9.getType();
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass10 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
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
            managementClient15.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
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
        java.lang.Class<?> wildcardClass17 = managementClient15.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str14 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient11.getPassword("");
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
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
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
        java.lang.String str14 = managementClient13.getType();
        java.lang.String str15 = managementClient13.getType();
        java.lang.String str16 = managementClient13.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient8.getType();
        java.lang.Class<?> wildcardClass10 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.Class<?> wildcardClass16 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
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
        java.lang.String str15 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
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
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
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
        java.lang.String str13 = managementClient5.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
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
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        java.lang.String str8 = managementClient4.getType();
        java.lang.String str9 = managementClient4.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str11 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient10.getType();
        java.lang.String str14 = managementClient10.getType();
        java.lang.Class<?> wildcardClass15 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!", "");
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
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
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
            java.lang.String str13 = managementClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
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
        java.lang.String str15 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
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
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
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
            managementClient13.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
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
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
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
        java.lang.Class<?> wildcardClass17 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient2.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
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
            managementClient6.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
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
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
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
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!");
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
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("management");
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
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
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
            managementClient11.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
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
        java.lang.String str12 = managementClient5.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "hi!");
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
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient7.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
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
            managementClient9.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "");
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
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!", "management");
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
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient5.getPassword("management");
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
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
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
            managementClient8.register("management", "management");
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
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
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
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
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
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
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
        java.lang.String str18 = managementClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "management");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        java.lang.String str6 = managementClient2.getType();
        java.lang.Class<?> wildcardClass7 = managementClient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
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
        java.lang.String str15 = managementClient11.getType();
        java.lang.Class<?> wildcardClass16 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
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
        java.lang.String str13 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient7.getPassword("management");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
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
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
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
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
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
            managementClient12.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
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
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient3.getType();
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.Class<?> wildcardClass10 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        java.lang.String str6 = managementClient1.getType();
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("management", "hi!");
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
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
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
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
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
        java.lang.String str18 = managementClient17.getType();
        login.managementClient managementClient19 = new login.managementClient((login.Client) managementClient17);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("management", "hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass15 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = managementClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("management", "");
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
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
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
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str13 = managementClient7.getType();
        java.lang.Class<?> wildcardClass14 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient10.getPassword("hi!");
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
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        java.lang.Class<?> wildcardClass11 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
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
        java.lang.String str19 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient1.getType();
        java.lang.String str9 = managementClient1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "hi!");
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
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
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
            managementClient10.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
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
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
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
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
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
        java.lang.String str11 = managementClient8.getType();
        java.lang.String str12 = managementClient8.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient5.getType();
        java.lang.Class<?> wildcardClass10 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
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
        java.lang.String str12 = managementClient10.getType();
        java.lang.String str13 = managementClient10.getType();
        java.lang.Class<?> wildcardClass14 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient6.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("management");
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
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
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
            managementClient11.register("", "management", "management");
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
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
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
            managementClient9.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("management", "", "");
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
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "management", "hi!");
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
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
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
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient17);
        java.lang.String str19 = managementClient18.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = managementClient18.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
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
        java.lang.String str15 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str9 = managementClient8.getType();
        java.lang.Class<?> wildcardClass10 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
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
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
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
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
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
        java.lang.String str12 = managementClient10.getType();
        java.lang.String str13 = managementClient10.getType();
        java.lang.String str14 = managementClient10.getType();
        java.lang.String str15 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
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
        java.lang.String str13 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        java.lang.String str6 = managementClient1.getType();
        java.lang.String str7 = managementClient1.getType();
        java.lang.String str8 = managementClient1.getType();
        java.lang.String str9 = managementClient1.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        java.lang.String str6 = managementClient1.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str9 = managementClient1.getType();
        java.lang.Class<?> wildcardClass10 = managementClient1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient5.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass13 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
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
        login.managementClient managementClient22 = new login.managementClient((login.Client) managementClient19);
        // The following exception was thrown during execution in test generation
        try {
            managementClient22.register("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "management" + "'", str20, "management");
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
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
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
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
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "hi!", "hi!");
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
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
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
            managementClient11.register("hi!", "management");
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
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
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
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
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
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
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
        java.lang.String str13 = managementClient11.getType();
        java.lang.Class<?> wildcardClass14 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
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
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
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
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str17 = managementClient16.getType();
        java.lang.String str18 = managementClient16.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
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
        java.lang.String str12 = managementClient11.getType();
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "hi!", "management");
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
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
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
            java.lang.String str14 = managementClient3.getPassword("management");
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
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
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
            managementClient8.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        java.lang.String str9 = managementClient3.getType();
        java.lang.String str10 = managementClient3.getType();
        java.lang.String str11 = managementClient3.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "", "hi!");
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
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
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
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
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
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass13 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
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
            managementClient9.register("hi!", "management");
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
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
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
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        java.lang.Class<?> wildcardClass13 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient5.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
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
            managementClient11.register("hi!", "");
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
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
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
        java.lang.String str11 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass12 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
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
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
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
        java.lang.Class<?> wildcardClass11 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "", "");
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
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
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
            managementClient4.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        java.lang.String str9 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient7.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "", "");
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
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass8 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass14 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "");
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
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("hi!", "management");
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
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient12.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("management", "", "hi!");
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
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
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
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = managementClient18.getPassword("");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient7.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
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
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass15 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        java.lang.String str6 = managementClient1.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.Class<?> wildcardClass8 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("hi!", "");
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
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        java.lang.Class<?> wildcardClass10 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
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
            managementClient11.register("hi!", "management", "management");
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
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        java.lang.String str18 = managementClient16.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
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
        java.lang.Class<?> wildcardClass15 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
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
        java.lang.String str19 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
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
        java.lang.String str12 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
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
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient11.getPassword("");
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
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "", "");
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
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient17);
        login.managementClient managementClient19 = new login.managementClient((login.Client) managementClient18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = managementClient19.getPassword("management");
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
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
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
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        java.lang.String str16 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
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
            java.lang.String str13 = managementClient9.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("management");
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
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
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
            managementClient6.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
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
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        java.lang.Class<?> wildcardClass9 = managementClient1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.Class<?> wildcardClass7 = managementClient4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
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
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!", "management");
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
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient3.getPassword("");
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
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient6.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
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
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient5.getPassword("");
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
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("hi!", "hi!");
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
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
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
        java.lang.String str16 = managementClient15.getType();
        java.lang.Class<?> wildcardClass17 = managementClient15.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
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
            java.lang.String str16 = managementClient12.getPassword("management");
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
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str19 = managementClient14.getType();
        login.managementClient managementClient20 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient21 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient22 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient22.register("", "");
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
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("management", "", "");
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
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient12.getType();
        java.lang.Class<?> wildcardClass15 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.Class<?> wildcardClass7 = managementClient3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
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
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
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
            managementClient11.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "hi!", "");
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
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        java.lang.Class<?> wildcardClass15 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
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
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient16);
        java.lang.String str19 = managementClient16.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str19 = managementClient14.getType();
        login.managementClient managementClient20 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient21 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient22 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str23 = managementClient22.getType();
        java.lang.String str24 = managementClient22.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "management" + "'", str23, "management");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "management" + "'", str24, "management");
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
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
            managementClient9.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "management", "management");
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
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("hi!", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
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
        java.lang.String str17 = managementClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("management", "hi!", "management");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
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
        java.lang.String str11 = managementClient1.getType();
        java.lang.Class<?> wildcardClass12 = managementClient1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
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
            managementClient7.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
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
            managementClient8.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
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
        java.lang.String str11 = managementClient10.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "management");
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
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
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
            java.lang.String str13 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "hi!");
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
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
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
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient4);
        java.lang.Class<?> wildcardClass13 = managementClient4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "management", "management");
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
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
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
            managementClient10.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
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
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        java.lang.Class<?> wildcardClass13 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
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
        java.lang.String str18 = managementClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("management", "", "hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str15 = managementClient14.getType();
        java.lang.String str16 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("management", "");
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
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str16 = managementClient10.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "hi!");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient10.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
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
        java.lang.String str12 = managementClient9.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.Class<?> wildcardClass9 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
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
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str13 = managementClient8.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str15 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
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
            java.lang.String str21 = managementClient12.getPassword("hi!");
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
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        java.lang.Class<?> wildcardClass11 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "management", "management");
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
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str13 = managementClient8.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "management");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient12.getPassword("hi!");
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
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
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
        java.lang.String str16 = managementClient12.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient17);
        java.lang.Class<?> wildcardClass19 = managementClient18.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
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
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
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
        java.lang.String str14 = managementClient12.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        java.lang.String str9 = managementClient5.getType();
        java.lang.String str10 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
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
        java.lang.String str14 = managementClient5.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
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
            java.lang.String str15 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient10.getType();
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "");
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
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient5.getType();
        java.lang.String str10 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
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
        java.lang.Class<?> wildcardClass10 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
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
        java.lang.String str16 = managementClient12.getType();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str16 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient13.getPassword("hi!");
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
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        java.lang.Class<?> wildcardClass9 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
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
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
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
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
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
        java.lang.String str12 = managementClient10.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
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
        java.lang.String str15 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
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
            managementClient15.register("", "", "management");
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
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "management", "");
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
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
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
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str18 = managementClient17.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
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
            managementClient18.register("", "management");
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
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
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
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str19 = managementClient14.getType();
        login.managementClient managementClient20 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient21 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient22 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str23 = managementClient14.getType();
        java.lang.String str24 = managementClient14.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "management" + "'", str23, "management");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "management" + "'", str24, "management");
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
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
        java.lang.String str17 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "");
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
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
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
        java.lang.Class<?> wildcardClass16 = managementClient15.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        java.lang.String str9 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient5.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient17.getPassword("management");
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
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
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
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
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
        java.lang.String str12 = managementClient11.getType();
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
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
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient7.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
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
            managementClient16.register("", "hi!");
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
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass11 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
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
        java.lang.String str12 = managementClient7.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str14 = managementClient7.getType();
        java.lang.String str15 = managementClient7.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
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
        java.lang.Class<?> wildcardClass17 = managementClient16.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        java.lang.String str8 = managementClient4.getType();
        java.lang.Class<?> wildcardClass9 = managementClient4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
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
            managementClient18.register("management", "management");
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
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass9 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
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
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        java.lang.String str16 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!", "management");
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
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
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
        java.lang.String str10 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
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
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
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
        java.lang.String str10 = managementClient8.getType();
        java.lang.String str11 = managementClient8.getType();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
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
            managementClient7.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }
}

