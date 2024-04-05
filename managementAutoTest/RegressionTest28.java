package managementAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

    public static boolean debug = false;

    @Test
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14001");
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
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14002");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14003");
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
        java.lang.String str10 = managementClient4.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14004");
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
        java.lang.String str14 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14005");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14006");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management", "hi!");
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
    public void test14007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14007");
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
        java.lang.String str12 = managementClient6.getType();
        java.lang.String str13 = managementClient6.getType();
        java.lang.String str14 = managementClient6.getType();
        java.lang.String str15 = managementClient6.getType();
        java.lang.String str16 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14008");
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
            managementClient9.register("", "", "management");
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
    public void test14009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14009");
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
        java.lang.String str11 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient8.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14010");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient4.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14011");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14012");
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
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14013");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        java.lang.Class<?> wildcardClass10 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14014");
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
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient9.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14015");
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
            managementClient3.register("hi!", "hi!", "management");
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
    public void test14016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14016");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14017");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient15.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14018");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str17 = managementClient16.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test14019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14019");
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
        java.lang.String str14 = managementClient13.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14020");
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
            java.lang.String str14 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14021");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient13);
        java.lang.Class<?> wildcardClass17 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14022");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!", "");
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
    public void test14023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14023");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14024");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14025");
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
            java.lang.String str16 = managementClient14.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14026");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass9 = managementClient8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14027");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14028");
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
        java.lang.Class<?> wildcardClass16 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14029");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str10 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14030");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14031");
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
        java.lang.Class<?> wildcardClass19 = managementClient18.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test14032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14032");
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
        java.lang.String str11 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14033");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14034");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14035");
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
            java.lang.String str12 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14036");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient13.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14037");
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
        java.lang.Class<?> wildcardClass18 = managementClient17.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14038");
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
        java.lang.String str19 = managementClient17.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
    }

    @Test
    public void test14039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14039");
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
            managementClient9.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14040");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14041");
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
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str12 = managementClient7.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14042");
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
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14043");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14044");
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
        java.lang.String str10 = managementClient1.getType();
        java.lang.String str11 = managementClient1.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14045");
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
            java.lang.String str13 = managementClient10.getPassword("management");
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
    public void test14046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14046");
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
        java.lang.String str13 = managementClient11.getType();
        java.lang.String str14 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient11.getPassword("management");
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
    public void test14047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14047");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14048");
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
        login.managementClient managementClient20 = new login.managementClient((login.Client) managementClient18);
        // The following exception was thrown during execution in test generation
        try {
            managementClient20.register("", "management", "hi!");
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
    public void test14049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14049");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("hi!");
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
    public void test14050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14050");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test14051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14051");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14052");
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
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient9.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14053");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "hi!", "hi!");
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
    public void test14054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14054");
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
            managementClient3.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14055");
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
        java.lang.String str12 = managementClient6.getType();
        java.lang.Class<?> wildcardClass13 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14056");
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
        java.lang.String str17 = managementClient16.getType();
        java.lang.String str18 = managementClient16.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test14057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14057");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14058");
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
            managementClient16.register("management", "", "");
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
    public void test14059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14059");
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
            managementClient8.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test14060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14060");
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
        java.lang.String str13 = managementClient11.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14061");
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
        java.lang.Class<?> wildcardClass13 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14062");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        java.lang.String str8 = managementClient4.getType();
        java.lang.String str9 = managementClient4.getType();
        java.lang.Class<?> wildcardClass10 = managementClient4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14063");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14064");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14065");
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
        java.lang.Class<?> wildcardClass10 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14066");
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
            managementClient12.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14067");
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
            managementClient19.register("management", "management");
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
    public void test14068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14068");
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
        java.lang.String str17 = managementClient14.getType();
        java.lang.String str18 = managementClient14.getType();
        java.lang.String str19 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = managementClient14.getPassword("hi!");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
    }

    @Test
    public void test14069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14069");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14070");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14071");
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
        java.lang.String str18 = managementClient17.getType();
        login.managementClient managementClient19 = new login.managementClient((login.Client) managementClient17);
        java.lang.Class<?> wildcardClass20 = managementClient19.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test14072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14072");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "", "");
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
    public void test14073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14073");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14074");
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
        java.lang.String str14 = managementClient13.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14075");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14076");
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
        java.lang.Class<?> wildcardClass16 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14077");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14078");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14079");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14080");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14081");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14082");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!", "hi!");
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
    public void test14083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14083");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14084");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14085");
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
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        java.lang.Class<?> wildcardClass15 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14086");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14087");
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
        java.lang.String str14 = managementClient13.getType();
        java.lang.String str15 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14088");
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
        java.lang.String str17 = managementClient11.getType();
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test14089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14089");
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
            managementClient8.register("hi!", "management");
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
    public void test14090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14090");
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
        java.lang.String str16 = managementClient11.getType();
        java.lang.Class<?> wildcardClass17 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14091");
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
        java.lang.String str12 = managementClient4.getType();
        java.lang.String str13 = managementClient4.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("management");
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
    public void test14092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14092");
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
        java.lang.String str13 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14093");
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
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14094");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient1.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14095");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass15 = managementClient11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14096");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient6.getPassword("");
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
    public void test14097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14097");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        java.lang.Class<?> wildcardClass16 = managementClient15.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14098");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        java.lang.Class<?> wildcardClass10 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14099");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14100");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14101");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14102");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "", "management");
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
    public void test14103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14103");
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
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str13 = managementClient9.getType();
        java.lang.Class<?> wildcardClass14 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14104");
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
            managementClient7.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14105");
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
            managementClient10.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test14106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14106");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test14107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14107");
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
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14108");
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
        java.lang.Class<?> wildcardClass13 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14109");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14110");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14111");
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
        java.lang.String str11 = managementClient10.getType();
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14112");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14113");
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
        login.managementClient managementClient23 = new login.managementClient((login.Client) managementClient19);
        login.managementClient managementClient24 = new login.managementClient((login.Client) managementClient19);
        login.managementClient managementClient25 = new login.managementClient((login.Client) managementClient19);
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
    public void test14114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14114");
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
            managementClient13.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test14115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14115");
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
        java.lang.String str17 = managementClient11.getType();
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test14116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14116");
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
            managementClient8.register("", "");
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
    public void test14117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14117");
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
        java.lang.String str15 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient12.getPassword("management");
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
    public void test14118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14118");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14119");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14120");
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
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14121");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        java.lang.String str9 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14122");
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
        java.lang.String str13 = managementClient12.getType();
        java.lang.Class<?> wildcardClass14 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14123");
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
        java.lang.String str15 = managementClient13.getType();
        java.lang.Class<?> wildcardClass16 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14124");
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
            managementClient13.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14125");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14126");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        java.lang.Class<?> wildcardClass8 = managementClient4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14127");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        java.lang.String str10 = managementClient7.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14128");
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
        java.lang.String str16 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14129");
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
        java.lang.String str14 = managementClient12.getType();
        java.lang.String str15 = managementClient12.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14130");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14131");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str13 = managementClient7.getType();
        java.lang.String str14 = managementClient7.getType();
        java.lang.Class<?> wildcardClass15 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14132");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14133");
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
        java.lang.String str14 = managementClient13.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14134");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str15 = managementClient12.getType();
        java.lang.Class<?> wildcardClass16 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14135");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!", "hi!");
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
    public void test14136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14136");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        java.lang.String str6 = managementClient2.getType();
        java.lang.String str7 = managementClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient2.register("", "", "management");
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
    public void test14137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14137");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14138");
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
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14139");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("hi!");
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
    public void test14140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14140");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14141");
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
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14142");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str15 = managementClient14.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14143");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14144");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14145");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14146");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str8 = managementClient2.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            managementClient2.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14147");
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
            managementClient3.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14148");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14149");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14150");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient5.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14151");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass9 = managementClient7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14152");
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
            managementClient11.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14153");
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
        java.lang.String str15 = managementClient13.getType();
        java.lang.String str16 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14154");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "management");
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
    public void test14155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14155");
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
            managementClient14.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14156");
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
            managementClient10.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14157");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test14158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14158");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14159");
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
            java.lang.String str11 = managementClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14160");
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
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14161");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str15 = managementClient14.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14162");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14163");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14164");
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
        java.lang.String str12 = managementClient11.getType();
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14165");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14166");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient9.getType();
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14167");
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
            managementClient10.register("management", "management", "hi!");
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
    public void test14168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14168");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        java.lang.Class<?> wildcardClass12 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14169");
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
        java.lang.String str10 = managementClient8.getType();
        java.lang.String str11 = managementClient8.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14170");
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
            managementClient5.register("", "", "");
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
    public void test14171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14171");
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
        java.lang.String str18 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test14172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14172");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("management");
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
    public void test14173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14173");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("hi!");
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
    public void test14174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14174");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "");
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
    public void test14175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14175");
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
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str15 = managementClient14.getType();
        java.lang.String str16 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14176");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        java.lang.String str9 = managementClient3.getType();
        java.lang.Class<?> wildcardClass10 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14177");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14178");
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
        java.lang.String str18 = managementClient17.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test14179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14179");
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
    public void test14180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14180");
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
        java.lang.String str18 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = managementClient15.getPassword("management");
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
    public void test14181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14181");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14182");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "hi!", "management");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14183");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass14 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14184");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "");
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
    public void test14185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14185");
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
        java.lang.String str10 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14186");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14187");
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
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14188");
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
        login.managementClient managementClient19 = new login.managementClient((login.Client) managementClient18);
        // The following exception was thrown during execution in test generation
        try {
            managementClient19.register("hi!", "hi!", "");
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
    public void test14189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14189");
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
        java.lang.String str11 = managementClient3.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14190");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14191");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass11 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14192");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient9.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14193");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient5.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient5.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14194");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management");
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
    public void test14195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14195");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str18 = managementClient17.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test14196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14196");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14197");
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
        java.lang.String str16 = managementClient14.getType();
        java.lang.Class<?> wildcardClass17 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14198");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14199");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14200");
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
        java.lang.String str12 = managementClient6.getType();
        java.lang.String str13 = managementClient6.getType();
        java.lang.String str14 = managementClient6.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14201");
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
        java.lang.String str15 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14202");
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
        java.lang.String str11 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14203");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14204");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14205");
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
            managementClient15.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14206");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14207");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14208");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("", "hi!", "management");
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
    public void test14209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14209");
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
            managementClient11.register("management", "");
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
    public void test14210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14210");
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
        java.lang.String str17 = managementClient12.getType();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test14211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14211");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient6.getPassword("hi!");
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
    public void test14212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14212");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14213");
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
            managementClient12.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test14214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14214");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("");
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
    public void test14215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14215");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass8 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14216");
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
            managementClient10.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test14217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14217");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "hi!");
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
    public void test14218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14218");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str13 = managementClient8.getType();
        java.lang.String str14 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "management", "");
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
    public void test14219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14219");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14220");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "management", "management");
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
    public void test14221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14221");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14222");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
    }

    @Test
    public void test14223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14223");
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
        java.lang.String str16 = managementClient15.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14224");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient3.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        java.lang.Class<?> wildcardClass10 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14225");
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
        java.lang.String str15 = managementClient14.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14226");
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
        login.managementClient managementClient20 = new login.managementClient((login.Client) managementClient19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = managementClient20.getPassword("");
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
    public void test14227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14227");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass11 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14228");
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
            java.lang.String str13 = managementClient6.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14229");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14230");
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
            java.lang.String str13 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14231");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14232");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass12 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14233");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient2);
        java.lang.Class<?> wildcardClass11 = managementClient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14234");
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
        java.lang.String str11 = managementClient10.getType();
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14235");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient15.getPassword("");
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
    public void test14236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14236");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14237");
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
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14238");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14239");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14240");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "management");
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
    }

    @Test
    public void test14241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14241");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        java.lang.String str8 = managementClient4.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14242");
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
            java.lang.String str13 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14243");
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
        java.lang.String str13 = managementClient3.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14244");
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
        java.lang.String str14 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14245");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14246");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test14247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14247");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14248");
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
            managementClient10.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test14249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14249");
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
            managementClient9.register("hi!", "");
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
    public void test14250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14250");
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
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "hi!", "");
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
    public void test14251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14251");
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
        java.lang.String str11 = managementClient8.getType();
        java.lang.Class<?> wildcardClass12 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14252");
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
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14253");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        java.lang.String str9 = managementClient5.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14254");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14255");
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
            managementClient11.register("management", "hi!", "hi!");
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
    public void test14256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14256");
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
        java.lang.Class<?> wildcardClass16 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14257");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14258");
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
            managementClient12.register("hi!", "management", "management");
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
    public void test14259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14259");
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
        java.lang.String str18 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test14260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14260");
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
        java.lang.Class<?> wildcardClass14 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14261");
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
        java.lang.String str10 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14262");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient8.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14263");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass13 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14264");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str15 = managementClient5.getType();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14265");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test14266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14266");
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
        java.lang.String str11 = managementClient3.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14267");
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
        java.lang.Class<?> wildcardClass12 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14268");
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
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14269");
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
        java.lang.String str14 = managementClient13.getType();
        java.lang.Class<?> wildcardClass15 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14270");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        java.lang.Class<?> wildcardClass15 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14271");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14272");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14273");
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
        java.lang.String str13 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14274");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str16 = managementClient13.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14275");
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
        java.lang.String str12 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14276");
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
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14277");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management", "");
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
    public void test14278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14278");
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
            managementClient8.register("management", "hi!");
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
    public void test14279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14279");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str10 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14280");
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
        java.lang.String str13 = managementClient8.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14281");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14282");
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
            managementClient6.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14283");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str11 = managementClient10.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14284");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14285");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14286");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14287");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14288");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str15 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14289");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "", "management");
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
    public void test14290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14290");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14291");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14292");
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
            managementClient16.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14293");
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
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("");
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
    public void test14294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14294");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14295");
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
        java.lang.String str11 = managementClient5.getType();
        java.lang.String str12 = managementClient5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14296");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        java.lang.Class<?> wildcardClass16 = managementClient15.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14297");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test14298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14298");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test14299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14299");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "", "hi!");
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
    public void test14300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14300");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test14301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14301");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass13 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14302");
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
        java.lang.String str10 = managementClient9.getType();
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14303");
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
        java.lang.String str11 = managementClient10.getType();
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14304");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14305");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14306");
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
        java.lang.String str15 = managementClient13.getType();
        java.lang.Class<?> wildcardClass16 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14307");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "management");
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
    public void test14308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14308");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14309");
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
            managementClient11.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14310");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str15 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14311");
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
        java.lang.String str11 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14312");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14313");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test14314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14314");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14315");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str8 = managementClient4.getType();
        java.lang.String str9 = managementClient4.getType();
        java.lang.String str10 = managementClient4.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14316");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14317");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14318");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        java.lang.String str3 = managementClient1.getType();
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test14319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14319");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14320");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14321");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14322");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14323");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test14324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14324");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14325");
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
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14326");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "management");
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
    public void test14327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14327");
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
            java.lang.String str16 = managementClient12.getPassword("");
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
    public void test14328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14328");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14329");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14330");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14331");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!", "management");
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
    public void test14332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14332");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14333");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test14334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14334");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("", "");
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
    public void test14335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14335");
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
        java.lang.String str13 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14336");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14337");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14338");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "");
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
    }

    @Test
    public void test14339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14339");
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
        java.lang.Class<?> wildcardClass17 = managementClient16.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14340");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14341");
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
            managementClient8.register("hi!", "", "hi!");
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
    public void test14342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14342");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14343");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient14.getPassword("");
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
    public void test14344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14344");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14345");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "hi!", "");
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
    }

    @Test
    public void test14346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14346");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test14347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14347");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str8 = managementClient2.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14348");
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
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient7.getPassword("");
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
    public void test14349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14349");
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
            managementClient11.register("hi!", "hi!", "management");
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
    public void test14350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14350");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14351");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient1.getType();
        java.lang.Class<?> wildcardClass8 = managementClient1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14352");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14353");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient15.getPassword("hi!");
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
    public void test14354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14354");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14355");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14356");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14357");
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
        java.lang.String str17 = managementClient13.getType();
        java.lang.String str18 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test14358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14358");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14359");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test14360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14360");
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
        java.lang.Class<?> wildcardClass10 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14361");
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
            java.lang.String str17 = managementClient15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14362");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test14363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14363");
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
        java.lang.String str12 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient9.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14364");
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
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14365");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        java.lang.String str6 = managementClient2.getType();
        java.lang.String str7 = managementClient2.getType();
        java.lang.String str8 = managementClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient2.register("hi!", "", "");
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
    public void test14366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14366");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14367");
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
        java.lang.String str11 = managementClient10.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14368");
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
        java.lang.String str11 = managementClient8.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass14 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14369");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test14370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14370");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient8.getType();
        java.lang.Class<?> wildcardClass10 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14371");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        java.lang.Class<?> wildcardClass17 = managementClient16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14372");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14373");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14374");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test14375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14375");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str12 = managementClient3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14376");
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
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14377");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!", "management");
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
    public void test14378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14378");
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
        java.lang.String str15 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient13.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14379");
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
        java.lang.String str10 = managementClient3.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14380");
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
        java.lang.String str13 = managementClient12.getType();
        java.lang.String str14 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14381");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14382");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = managementClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14383");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14384");
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
        java.lang.String str20 = managementClient18.getType();
        java.lang.String str21 = managementClient18.getType();
        login.managementClient managementClient22 = new login.managementClient((login.Client) managementClient18);
        // The following exception was thrown during execution in test generation
        try {
            managementClient18.register("management", "hi!");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "management" + "'", str21, "management");
    }

    @Test
    public void test14385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14385");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str12 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14386");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14387");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "", "");
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
    }

    @Test
    public void test14388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14388");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        java.lang.String str15 = managementClient13.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14389");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14390");
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
        java.lang.String str11 = managementClient10.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14391");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14392");
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
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14393");
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
        java.lang.Class<?> wildcardClass16 = managementClient15.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14394");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14395");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14396");
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
        java.lang.String str14 = managementClient13.getType();
        java.lang.String str15 = managementClient13.getType();
        java.lang.String str16 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14397");
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
        login.managementClient managementClient20 = new login.managementClient((login.Client) managementClient18);
        login.managementClient managementClient21 = new login.managementClient((login.Client) managementClient20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = managementClient21.getPassword("hi!");
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
    public void test14398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14398");
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
        java.lang.String str11 = managementClient3.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14399");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14400");
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
        java.lang.Class<?> wildcardClass14 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14401");
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
        java.lang.String str20 = managementClient19.getType();
        java.lang.String str21 = managementClient19.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = managementClient19.getPassword("management");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "management" + "'", str21, "management");
    }

    @Test
    public void test14402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14402");
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
            managementClient12.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14403");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient12.getType();
        java.lang.Class<?> wildcardClass14 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14404");
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
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14405");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14406");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14407");
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
        java.lang.String str14 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14408");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14409");
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
        java.lang.String str10 = managementClient9.getType();
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14410");
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
            java.lang.String str10 = managementClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14411");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("");
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
    public void test14412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14412");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14413");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "hi!", "");
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
    public void test14414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14414");
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
        java.lang.String str14 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14415");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("hi!", "management");
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
    public void test14416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14416");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14417");
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
            managementClient13.register("hi!", "management");
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
    public void test14418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14418");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14419");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14420");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "hi!");
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
    public void test14421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14421");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        java.lang.String str16 = managementClient14.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14422");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str7 = managementClient5.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14423");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14424");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14425");
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
        java.lang.String str11 = managementClient9.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass13 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14426");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14427");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14428");
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
        login.managementClient managementClient19 = new login.managementClient((login.Client) managementClient18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14429");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14430");
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
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient10.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14431");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient15.getPassword("hi!");
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
    public void test14432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14432");
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
        java.lang.String str16 = managementClient15.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14433");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str16 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14434");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test14435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14435");
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
        java.lang.String str16 = managementClient12.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14436");
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
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str12 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14437");
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
            managementClient4.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14438");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test14439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14439");
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
        java.lang.Class<?> wildcardClass13 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14440");
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
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14441");
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
    public void test14442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14442");
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
        java.lang.Class<?> wildcardClass16 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14443");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str9 = managementClient8.getType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14444");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient12.getType();
        java.lang.Class<?> wildcardClass14 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14445");
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
        java.lang.String str14 = managementClient13.getType();
        java.lang.String str15 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14446");
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
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14447");
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
        java.lang.Class<?> wildcardClass18 = managementClient17.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14448");
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
            managementClient11.register("", "management");
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
    public void test14449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14449");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "management");
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
    public void test14450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14450");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient6.getType();
        java.lang.String str8 = managementClient6.getType();
        java.lang.String str9 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14451");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14452");
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
        java.lang.String str13 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("", "", "hi!");
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
    public void test14453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14453");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14454");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient12.getPassword("management");
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
    public void test14455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14455");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "management", "");
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
    public void test14456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14456");
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
            managementClient11.register("", "hi!", "");
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
    public void test14457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14457");
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
        java.lang.String str16 = managementClient15.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test14458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14458");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test14459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14459");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14460");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
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
    public void test14461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14461");
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
            java.lang.String str14 = managementClient8.getPassword("hi!");
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
    public void test14462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14462");
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
        java.lang.String str11 = managementClient5.getType();
        java.lang.String str12 = managementClient5.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14463");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14464");
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
        java.lang.String str13 = managementClient8.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14465");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14466");
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
        java.lang.String str17 = managementClient16.getType();
        java.lang.Class<?> wildcardClass18 = managementClient16.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14467");
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
        java.lang.Class<?> wildcardClass16 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14468");
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
            java.lang.String str12 = managementClient3.getPassword("hi!");
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
    public void test14469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14469");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14470");
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
        java.lang.String str15 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test14471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14471");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test14472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14472");
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
            managementClient11.register("hi!", "management", "management");
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
    public void test14473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14473");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        java.lang.String str10 = managementClient3.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14474");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14475");
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
            java.lang.String str13 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14476");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("");
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
    public void test14477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14477");
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
            managementClient10.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14478");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14479");
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
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test14480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14480");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14481");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14482");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test14483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14483");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass9 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14484");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test14485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14485");
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
            managementClient14.register("", "hi!");
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
    public void test14486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14486");
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
            java.lang.String str10 = managementClient1.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14487");
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
        java.lang.String str14 = managementClient13.getType();
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str17 = managementClient15.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test14488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14488");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test14489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14489");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str9 = managementClient4.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14490");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14491");
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
        java.lang.Class<?> wildcardClass15 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14492");
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
            managementClient6.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test14493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14493");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14494");
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
        java.lang.String str11 = managementClient8.getType();
        java.lang.String str12 = managementClient8.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test14495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14495");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test14496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14496");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test14497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14497");
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
        java.lang.String str12 = managementClient4.getType();
        java.lang.String str13 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient4.getPassword("management");
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
    public void test14498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14498");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient3.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test14499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14499");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14500");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

