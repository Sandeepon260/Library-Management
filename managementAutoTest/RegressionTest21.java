package managementAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

    public static boolean debug = false;

    @Test
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "hi!");
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
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient15.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
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
        java.lang.String str10 = managementClient7.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
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
            java.lang.String str13 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
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
        java.lang.String str14 = managementClient12.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass16 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient9.getPassword("hi!");
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
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
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
        java.lang.String str10 = managementClient3.getType();
        java.lang.String str11 = managementClient3.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
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
        java.lang.String str15 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
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
        java.lang.String str14 = managementClient10.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str16 = managementClient10.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "");
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
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
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
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
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
            managementClient3.register("hi!", "", "hi!");
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
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
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
        java.lang.String str17 = managementClient12.getType();
        java.lang.String str18 = managementClient12.getType();
        java.lang.String str19 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = managementClient12.getPassword("hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
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
            java.lang.String str20 = managementClient12.getPassword("hi!");
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
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient12.getPassword("hi!");
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
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str16 = managementClient13.getType();
        java.lang.String str17 = managementClient13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str9 = managementClient2.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient2);
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
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
            managementClient9.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass11 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient5.getPassword("hi!");
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
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
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
        java.lang.String str11 = managementClient6.getType();
        java.lang.String str12 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient6.getPassword("");
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
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = managementClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
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
        java.lang.String str17 = managementClient12.getType();
        java.lang.String str18 = managementClient12.getType();
        login.managementClient managementClient19 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient19.register("hi!", "", "management");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient13.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient13.getType();
        java.lang.String str15 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
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
            managementClient9.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient8.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str13 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "", "management");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "");
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
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
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
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str15 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
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
        java.lang.String str11 = managementClient10.getType();
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
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
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient9.getPassword("");
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
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
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
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient10.getType();
        java.lang.Class<?> wildcardClass14 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
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
        java.lang.String str16 = managementClient11.getType();
        java.lang.Class<?> wildcardClass17 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            managementClient18.register("hi!", "hi!");
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
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass17 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
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
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient7.getPassword("");
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
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient(client0);
        login.managementClient managementClient5 = new login.managementClient(client0);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
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
        java.lang.String str17 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient15.getPassword("management");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
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
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        java.lang.String str18 = managementClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = managementClient16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
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
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "", "management");
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
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "hi!");
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
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient14.getPassword("hi!");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
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
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
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
            java.lang.String str12 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!", "hi!");
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
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        java.lang.Class<?> wildcardClass17 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient6.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
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
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = managementClient18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
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
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str15 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
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
        java.lang.Class<?> wildcardClass12 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient(client0);
        login.managementClient managementClient5 = new login.managementClient(client0);
        login.managementClient managementClient6 = new login.managementClient(client0);
        java.lang.Class<?> wildcardClass7 = managementClient6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        java.lang.String str9 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient4.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient17.getPassword("management");
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
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
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
        java.lang.String str13 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient7.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient15.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str18 = managementClient17.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("hi!", "management", "management");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        java.lang.String str10 = managementClient4.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str16 = managementClient15.getType();
        java.lang.Class<?> wildcardClass17 = managementClient15.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
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
            managementClient8.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str17 = managementClient12.getType();
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = managementClient12.getPassword("");
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
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
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
        java.lang.String str15 = managementClient11.getType();
        java.lang.String str16 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient11.getPassword("management");
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
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str10 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient12.getPassword("management");
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
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
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
        java.lang.Class<?> wildcardClass12 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
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
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient5.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
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
        java.lang.String str16 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("");
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
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
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
        java.lang.String str12 = managementClient6.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            managementClient2.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass14 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        java.lang.Class<?> wildcardClass11 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
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
        java.lang.Class<?> wildcardClass11 = managementClient1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass8 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
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
        java.lang.Class<?> wildcardClass17 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
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
        java.lang.String str15 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient13.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
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
            managementClient10.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("management");
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
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "management");
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
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
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
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
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
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
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
            managementClient6.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
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
            managementClient18.register("hi!", "hi!");
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
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
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
        java.lang.String str18 = managementClient12.getType();
        login.managementClient managementClient19 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
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
            java.lang.String str16 = managementClient8.getPassword("management");
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
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "", "management");
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
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
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
        java.lang.String str16 = managementClient15.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str9 = managementClient1.getType();
        java.lang.String str10 = managementClient1.getType();
        java.lang.String str11 = managementClient1.getType();
        java.lang.String str12 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient7.getType();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
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
        java.lang.String str12 = managementClient10.getType();
        java.lang.Class<?> wildcardClass13 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
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
        java.lang.String str18 = managementClient17.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
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
            managementClient11.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("hi!", "");
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
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
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
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
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
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
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
            managementClient12.register("", "hi!", "");
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
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
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
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str17 = managementClient6.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
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
            java.lang.String str16 = managementClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient13.getPassword("management");
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
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
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
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
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
            java.lang.String str9 = managementClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
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
            managementClient9.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
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
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
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
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient13.getPassword("management");
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
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
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
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "management", "management");
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
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
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
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str13 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "hi!");
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
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str13 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "", "hi!");
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
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
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
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient18.register("", "management", "management");
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
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
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
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
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
            managementClient3.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
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
            managementClient13.register("management", "hi!", "hi!");
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
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient10.getType();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
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
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str10 = managementClient2.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
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
            managementClient10.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
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
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
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
        java.lang.String str11 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "hi!");
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
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        java.lang.String str11 = managementClient7.getType();
        java.lang.Class<?> wildcardClass12 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
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
        java.lang.Class<?> wildcardClass14 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
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
        java.lang.Class<?> wildcardClass14 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient16.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        java.lang.String str11 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
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
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
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
            managementClient8.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str9 = managementClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
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
            java.lang.String str9 = managementClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("management", "");
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
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
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
            java.lang.String str19 = managementClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "", "");
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
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
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
        java.lang.String str13 = managementClient10.getType();
        java.lang.String str14 = managementClient10.getType();
        java.lang.Class<?> wildcardClass15 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
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
        java.lang.String str13 = managementClient8.getType();
        java.lang.String str14 = managementClient8.getType();
        java.lang.String str15 = managementClient8.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
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
        java.lang.String str10 = managementClient9.getType();
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
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
            managementClient10.register("hi!", "hi!");
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
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
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
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
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
        java.lang.String str16 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "hi!", "");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
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
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        java.lang.Class<?> wildcardClass12 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
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
        java.lang.String str11 = managementClient10.getType();
        java.lang.String str12 = managementClient10.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "hi!");
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
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str17 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient12.getPassword("hi!");
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
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass12 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
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
        java.lang.String str14 = managementClient12.getType();
        java.lang.Class<?> wildcardClass15 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
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
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        java.lang.String str11 = managementClient7.getType();
        java.lang.String str12 = managementClient7.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str14 = managementClient7.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management", "management");
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
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
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
        java.lang.String str16 = managementClient12.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
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
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
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
            java.lang.String str15 = managementClient9.getPassword("management");
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
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
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
            java.lang.String str18 = managementClient16.getPassword("hi!");
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
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
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
            managementClient19.register("", "", "hi!");
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
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
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
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str14 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient19.register("management", "hi!");
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
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
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
        java.lang.Class<?> wildcardClass10 = managementClient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
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
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
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
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient2.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
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
        java.lang.Class<?> wildcardClass10 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
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
        java.lang.String str11 = managementClient10.getType();
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
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
        java.lang.String str14 = managementClient9.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
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
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient14.getPassword("");
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
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass15 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
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
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
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
        java.lang.String str10 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "", "");
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
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
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
            java.lang.String str15 = managementClient12.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
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
            managementClient9.register("", "hi!");
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
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
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
            java.lang.String str19 = managementClient17.getPassword("hi!");
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
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
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
            managementClient15.register("management", "hi!");
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
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
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
            java.lang.String str16 = managementClient14.getPassword("");
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
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
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
        java.lang.String str11 = managementClient3.getType();
        java.lang.String str12 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str13 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
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
        java.lang.String str16 = managementClient13.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
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
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
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
        java.lang.String str18 = managementClient14.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
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
        java.lang.String str16 = managementClient13.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass14 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass10 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass10 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
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
        java.lang.String str12 = managementClient6.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass14 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
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
            java.lang.String str14 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
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
        java.lang.String str14 = managementClient8.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str16 = managementClient8.getType();
        java.lang.Class<?> wildcardClass17 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
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
        java.lang.Class<?> wildcardClass12 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
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
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
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
        java.lang.String str14 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
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
        java.lang.Class<?> wildcardClass17 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
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
            java.lang.String str12 = managementClient9.getPassword("");
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
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
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
            managementClient8.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "", "");
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
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        java.lang.String str11 = managementClient7.getType();
        java.lang.String str12 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
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
        java.lang.String str18 = managementClient17.getType();
        java.lang.String str19 = managementClient17.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
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
        java.lang.String str15 = managementClient14.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient16);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "management", "hi!");
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
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient18.register("management", "", "hi!");
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
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
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
        java.lang.String str10 = managementClient3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str15 = managementClient13.getType();
        java.lang.String str16 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
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
        java.lang.String str15 = managementClient11.getType();
        java.lang.String str16 = managementClient11.getType();
        java.lang.Class<?> wildcardClass17 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass9 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient15.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str18 = managementClient17.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("management", "hi!", "");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        java.lang.String str6 = managementClient2.getType();
        java.lang.String str7 = managementClient2.getType();
        java.lang.String str8 = managementClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient2.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
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
        java.lang.String str17 = managementClient16.getType();
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient16);
        java.lang.Class<?> wildcardClass19 = managementClient18.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
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
        java.lang.String str12 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
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
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
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
        java.lang.String str13 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        java.lang.Class<?> wildcardClass17 = managementClient16.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
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
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
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
            java.lang.String str19 = managementClient17.getPassword("hi!");
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
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
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
        java.lang.String str15 = managementClient14.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str17 = managementClient16.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        java.lang.Class<?> wildcardClass8 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
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
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
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
            managementClient9.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("hi!", "hi!", "hi!");
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
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient15.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient5.getPassword("hi!");
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
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
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
        java.lang.String str16 = managementClient12.getType();
        java.lang.Class<?> wildcardClass17 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient7.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!", "management");
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
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = managementClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
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
        java.lang.String str20 = managementClient12.getType();
        login.managementClient managementClient21 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "hi!");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "management" + "'", str20, "management");
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
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
        java.lang.String str12 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient15.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("management", "management", "");
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
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient10.getPassword("");
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
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
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
            managementClient12.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("management", "", "management");
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
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
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
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass13 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
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
        java.lang.String str14 = managementClient5.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass16 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "management", "");
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
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
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
        java.lang.String str10 = managementClient3.getType();
        java.lang.Class<?> wildcardClass11 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
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
        java.lang.String str16 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
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
            java.lang.String str18 = managementClient13.getPassword("");
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
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
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
        java.lang.String str13 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        java.lang.Class<?> wildcardClass18 = managementClient17.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient4.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
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
        java.lang.String str11 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
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
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient1);
        java.lang.Class<?> wildcardClass11 = managementClient1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!", "");
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
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient2.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
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
            java.lang.String str14 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
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
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
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
        java.lang.String str11 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass10 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient3.getType();
        java.lang.String str8 = managementClient3.getType();
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient10.getPassword("management");
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
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
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
        java.lang.String str11 = managementClient10.getType();
        java.lang.String str12 = managementClient10.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "", "");
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
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
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
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
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
        java.lang.String str16 = managementClient11.getType();
        java.lang.String str17 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
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
        java.lang.String str16 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management");
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
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "management", "hi!");
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
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
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
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("");
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
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
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
        java.lang.String str12 = managementClient3.getType();
        java.lang.Class<?> wildcardClass13 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management");
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
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
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
            managementClient14.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
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
            java.lang.String str13 = managementClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
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
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
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
        java.lang.String str14 = managementClient13.getType();
        java.lang.Class<?> wildcardClass15 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
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
        java.lang.String str17 = managementClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
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
        java.lang.Class<?> wildcardClass18 = managementClient17.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
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
        java.lang.String str15 = managementClient12.getType();
        java.lang.String str16 = managementClient12.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str18 = managementClient12.getType();
        java.lang.Class<?> wildcardClass19 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient14.getPassword("hi!");
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
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
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
        java.lang.String str12 = managementClient5.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
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
            java.lang.String str14 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
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
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str9 = managementClient2.getType();
        java.lang.String str10 = managementClient2.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
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
            java.lang.String str15 = managementClient10.getPassword("management");
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
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
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
            java.lang.String str13 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str11 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "hi!");
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
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
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
        login.managementClient managementClient19 = new login.managementClient((login.Client) managementClient18);
        // The following exception was thrown during execution in test generation
        try {
            managementClient18.register("hi!", "hi!", "");
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
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
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
        java.lang.String str10 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient1.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
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
            java.lang.String str11 = managementClient7.getPassword("hi!");
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
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
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
        java.lang.String str16 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("management", "management", "hi!");
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
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
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
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.Class<?> wildcardClass7 = managementClient4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient15.getPassword("management");
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
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
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
            managementClient8.register("hi!", "management");
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
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass10 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
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
        java.lang.String str19 = managementClient18.getType();
        java.lang.String str20 = managementClient18.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient18.register("hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "management" + "'", str20, "management");
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "");
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
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
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
        java.lang.String str14 = managementClient10.getType();
        java.lang.Class<?> wildcardClass15 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        java.lang.String str3 = managementClient1.getType();
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
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
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient3.getType();
        java.lang.String str8 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
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
            managementClient17.register("", "hi!", "");
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
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
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
        java.lang.String str12 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient9.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
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
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient10.getType();
        java.lang.String str14 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
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
        java.lang.String str11 = managementClient7.getType();
        java.lang.String str12 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str12 = managementClient6.getType();
        java.lang.String str13 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str17 = managementClient16.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass10 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
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
            managementClient12.register("hi!", "hi!");
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
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
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
        java.lang.String str17 = managementClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
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
        java.lang.String str16 = managementClient13.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("", "", "hi!");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
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
            java.lang.String str12 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
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
            managementClient9.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
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
        java.lang.String str15 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
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
        java.lang.String str20 = managementClient12.getType();
        java.lang.String str21 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "management" + "'", str20, "management");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "management" + "'", str21, "management");
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
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
        java.lang.Class<?> wildcardClass10 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
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
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient(client0);
        login.managementClient managementClient5 = new login.managementClient(client0);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
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
        java.lang.String str14 = managementClient13.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
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
            managementClient10.register("management", "");
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
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
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
        java.lang.Class<?> wildcardClass10 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
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
            managementClient14.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
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
        java.lang.String str15 = managementClient14.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient16);
        java.lang.Class<?> wildcardClass19 = managementClient18.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
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
        java.lang.String str12 = managementClient3.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient5.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
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
            java.lang.String str13 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        java.lang.Class<?> wildcardClass12 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
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
        java.lang.Class<?> wildcardClass13 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient1.getType();
        java.lang.String str8 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }
}

