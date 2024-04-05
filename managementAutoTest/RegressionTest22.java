package managementAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
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
            managementClient18.register("hi!", "hi!");
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
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str17 = managementClient16.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
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
        login.managementClient managementClient20 = new login.managementClient((login.Client) managementClient18);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient7.getType();
        java.lang.Class<?> wildcardClass9 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
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
        java.lang.String str15 = managementClient13.getType();
        java.lang.String str16 = managementClient13.getType();
        java.lang.String str17 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient9.getPassword("hi!");
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
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "", "hi!");
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
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str11 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
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
            managementClient12.register("management", "");
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
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
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
            managementClient8.register("", "", "hi!");
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
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
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
            managementClient14.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
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
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        java.lang.Class<?> wildcardClass4 = managementClient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "", "management");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
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
            managementClient13.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
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
            managementClient10.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
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
            managementClient13.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
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
        java.lang.String str12 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
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
            managementClient8.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
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
            java.lang.String str18 = managementClient14.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
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
            managementClient10.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
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
            managementClient8.register("hi!", "", "hi!");
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
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
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
        java.lang.String str11 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
        java.lang.String str18 = managementClient15.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient5.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient13.getPassword("");
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
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
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
            managementClient9.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
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
            managementClient12.register("hi!", "", "management");
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
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
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
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
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
            managementClient11.register("hi!", "");
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
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
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
            managementClient13.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("hi!", "", "management");
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
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!", "hi!");
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
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass10 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
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
        java.lang.String str13 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
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
        java.lang.Class<?> wildcardClass17 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
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
        java.lang.String str11 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient(client0);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        java.lang.String str7 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
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
        java.lang.Class<?> wildcardClass18 = managementClient17.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
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
            java.lang.String str13 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
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
        java.lang.Class<?> wildcardClass15 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
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
        java.lang.Class<?> wildcardClass11 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
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
            managementClient5.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
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
        java.lang.String str11 = managementClient6.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
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
        java.lang.String str15 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "hi!", "management");
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
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
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
        java.lang.Class<?> wildcardClass14 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
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
        java.lang.String str15 = managementClient13.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient13);
        java.lang.Class<?> wildcardClass17 = managementClient16.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
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
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
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
        java.lang.String str10 = managementClient9.getType();
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
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
            java.lang.String str20 = managementClient18.getPassword("management");
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
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
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
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
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
        java.lang.String str11 = managementClient10.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
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
        java.lang.Class<?> wildcardClass14 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
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
            managementClient16.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
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
            managementClient12.register("hi!", "management");
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
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("hi!", "", "management");
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
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str4 = managementClient2.getType();
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = managementClient6.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
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
        java.lang.String str15 = managementClient14.getType();
        java.lang.String str16 = managementClient14.getType();
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
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
            managementClient9.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        java.lang.String str8 = managementClient5.getType();
        java.lang.Class<?> wildcardClass9 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
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
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
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
        java.lang.String str10 = managementClient3.getType();
        java.lang.String str11 = managementClient3.getType();
        java.lang.String str12 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "hi!");
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
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
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
        java.lang.String str13 = managementClient11.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
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
        java.lang.Class<?> wildcardClass13 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
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
        java.lang.String str17 = managementClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient16.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
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
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
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
        java.lang.String str17 = managementClient16.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
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
        java.lang.String str10 = managementClient8.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
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
        java.lang.String str10 = managementClient4.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("management");
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
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
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
            managementClient12.register("hi!", "hi!", "management");
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
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
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
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
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
        java.lang.String str11 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
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
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "hi!", "");
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
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
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
            managementClient19.register("", "");
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
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass11 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
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
        java.lang.Class<?> wildcardClass10 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
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
            managementClient15.register("management", "management", "");
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
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
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
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        java.lang.String str14 = managementClient9.getType();
        java.lang.String str15 = managementClient9.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str17 = managementClient16.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient8.getPassword("hi!");
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
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
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
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
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
        java.lang.String str10 = managementClient8.getType();
        java.lang.String str11 = managementClient8.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
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
            java.lang.String str13 = managementClient10.getPassword("management");
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
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
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
        java.lang.String str10 = managementClient8.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
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
            managementClient17.register("management", "hi!");
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
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
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
        java.lang.String str13 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient10.getPassword("");
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
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        java.lang.Class<?> wildcardClass17 = managementClient16.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
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
            java.lang.String str18 = managementClient16.getPassword("management");
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
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
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
            managementClient13.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
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
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass17 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
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
            java.lang.String str15 = managementClient13.getPassword("hi!");
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
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
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
            managementClient3.register("management", "", "management");
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
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
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
        java.lang.String str10 = managementClient5.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
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
        java.lang.Class<?> wildcardClass12 = managementClient9.getClass();
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
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
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
        java.lang.Class<?> wildcardClass11 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str8 = managementClient7.getType();
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str10 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
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
            java.lang.String str11 = managementClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
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
        java.lang.Class<?> wildcardClass16 = managementClient14.getClass();
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
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
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
        java.lang.String str11 = managementClient8.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
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
            managementClient5.register("management", "management", "hi!");
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
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
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
        java.lang.Class<?> wildcardClass12 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
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
            managementClient10.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass18 = managementClient17.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
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
            java.lang.String str13 = managementClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
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
            managementClient6.register("management", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("");
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
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
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
            java.lang.String str17 = managementClient13.getPassword("management");
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
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass11 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient15.getPassword("management");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
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
            java.lang.String str12 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "management");
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
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("management", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
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
        java.lang.String str15 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        java.lang.String str13 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
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
            java.lang.String str20 = managementClient16.getPassword("");
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
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
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
        java.lang.String str19 = managementClient18.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = managementClient18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
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
        java.lang.String str11 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient8.getPassword("");
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
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
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
            managementClient9.register("hi!", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
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
        java.lang.String str12 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
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
            managementClient15.register("hi!", "");
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
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
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
        java.lang.String str15 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
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
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient11.getPassword("");
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
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
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
        java.lang.Class<?> wildcardClass17 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
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
            managementClient11.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
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
        java.lang.String str13 = managementClient10.getType();
        java.lang.Class<?> wildcardClass14 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
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
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient12.getPassword("management");
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
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
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
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
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
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "management");
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
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
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
        java.lang.Class<?> wildcardClass15 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
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
            managementClient15.register("", "hi!", "hi!");
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
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str18 = managementClient17.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
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
            managementClient14.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
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
        java.lang.Class<?> wildcardClass15 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
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
            managementClient5.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
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
            java.lang.String str18 = managementClient12.getPassword("");
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
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
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
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "management", "hi!");
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
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
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
        java.lang.Class<?> wildcardClass16 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient8);
        java.lang.String str12 = managementClient8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
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
            java.lang.String str19 = managementClient12.getPassword("");
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
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
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
            java.lang.String str12 = managementClient10.getPassword("hi!");
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
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
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
        java.lang.Class<?> wildcardClass13 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
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
        java.lang.String str13 = managementClient11.getType();
        java.lang.Class<?> wildcardClass14 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("");
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
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient7.getPassword("hi!");
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
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        java.lang.String str6 = managementClient1.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "hi!", "management");
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
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
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
            managementClient8.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str7 = managementClient6.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str6 = managementClient2.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
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
            java.lang.String str11 = managementClient7.getPassword("");
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
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
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
            java.lang.String str15 = managementClient13.getPassword("");
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
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
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
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
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
            managementClient4.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
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
        java.lang.String str12 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
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
        java.lang.String str16 = managementClient14.getType();
        java.lang.Class<?> wildcardClass17 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
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
            java.lang.String str14 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
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
        java.lang.String str13 = managementClient9.getType();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "", "management");
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
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str15 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient16);
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient16);
        // The following exception was thrown during execution in test generation
        try {
            managementClient18.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient4.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
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
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
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
        java.lang.String str15 = managementClient14.getType();
        java.lang.String str16 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
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
            managementClient6.register("", "");
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
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient16.register("management", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
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
            java.lang.String str10 = managementClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
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
        java.lang.Class<?> wildcardClass13 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "hi!", "hi!");
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
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
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
        java.lang.String str10 = managementClient7.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass12 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "management");
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
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
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
        java.lang.String str11 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
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
            managementClient13.register("", "management", "management");
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
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
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
        java.lang.String str12 = managementClient10.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str14 = managementClient13.getType();
        java.lang.Class<?> wildcardClass15 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
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
        java.lang.Class<?> wildcardClass11 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
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
        java.lang.String str11 = managementClient8.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
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
            managementClient6.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
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
        java.lang.String str10 = managementClient8.getType();
        java.lang.Class<?> wildcardClass11 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
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
        java.lang.String str17 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
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
        java.lang.Class<?> wildcardClass13 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        java.lang.String str7 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
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
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
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
        java.lang.String str18 = managementClient17.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("", "hi!", "");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!", "");
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
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
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
            java.lang.String str16 = managementClient14.getPassword("management");
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
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
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
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
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
            java.lang.String str10 = managementClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
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
            java.lang.String str18 = managementClient15.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
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
            managementClient5.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str13 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management");
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
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
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
        java.lang.String str10 = managementClient8.getType();
        java.lang.String str11 = managementClient8.getType();
        java.lang.String str12 = managementClient8.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
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
            managementClient14.register("management", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "management");
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
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
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
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "hi!");
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
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
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
        java.lang.Class<?> wildcardClass10 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
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
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = managementClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = managementClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
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
        login.managementClient managementClient18 = new login.managementClient((login.Client) managementClient17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
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
        java.lang.Class<?> wildcardClass13 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
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
        java.lang.Class<?> wildcardClass13 = managementClient10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient3.getType();
        java.lang.String str5 = managementClient3.getType();
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str9 = managementClient3.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
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
        java.lang.String str12 = managementClient11.getType();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient11.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient5);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
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
        java.lang.String str11 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
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
        java.lang.String str10 = managementClient9.getType();
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
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
        java.lang.String str15 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("management", "hi!");
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
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
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
        java.lang.Class<?> wildcardClass14 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
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
        java.lang.String str15 = managementClient12.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str13 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str12 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("management", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient(client0);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
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
        java.lang.String str13 = managementClient9.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
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
        java.lang.String str12 = managementClient3.getType();
        java.lang.String str13 = managementClient3.getType();
        java.lang.Class<?> wildcardClass14 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
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
        java.lang.Class<?> wildcardClass16 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
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
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
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
            managementClient10.register("hi!", "", "");
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
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = managementClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str7 = managementClient1.getType();
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass10 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
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
        java.lang.String str14 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient8.getType();
        java.lang.String str10 = managementClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
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
            managementClient16.register("management", "", "management");
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
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
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
        java.lang.String str16 = managementClient15.getType();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
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
            managementClient11.register("", "management");
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
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient1.getType();
        java.lang.String str9 = managementClient1.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient1.getPassword("hi!");
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
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass9 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        java.lang.Class<?> wildcardClass12 = managementClient11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
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
        java.lang.String str12 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient10.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
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
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("hi!");
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
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient9.getPassword("");
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
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str6 = managementClient5.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass10 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
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
            managementClient10.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
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
            managementClient13.register("management", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
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
            managementClient14.register("hi!", "hi!", "management");
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
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str6 = managementClient3.getType();
        java.lang.String str7 = managementClient3.getType();
        java.lang.String str8 = managementClient3.getType();
        java.lang.String str9 = managementClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
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
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
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
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "management", "");
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
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
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
        java.lang.String str10 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
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
        java.lang.String str13 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("hi!", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
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
        java.lang.String str20 = managementClient15.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "management" + "'", str20, "management");
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient9);
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
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
            managementClient9.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("hi!");
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
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
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
        java.lang.String str15 = managementClient14.getType();
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient16.getPassword("management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
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
            managementClient11.register("hi!", "management", "hi!");
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
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        java.lang.Class<?> wildcardClass11 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "hi!", "management");
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
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient7.getPassword("hi!");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
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
        java.lang.String str12 = managementClient11.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
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
            managementClient12.register("management", "");
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
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass9 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
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
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
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
        java.lang.String str14 = managementClient11.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
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
        java.lang.String str11 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
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
        java.lang.String str11 = managementClient9.getType();
        java.lang.String str12 = managementClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "management", "management");
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
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient7.getPassword("");
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
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
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
            managementClient13.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str9 = managementClient8.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
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
        java.lang.String str12 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient11 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
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
            managementClient9.register("management", "hi!");
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
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
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
        java.lang.Class<?> wildcardClass12 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient4.getPassword("");
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
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
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
        java.lang.String str17 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
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
        java.lang.String str18 = managementClient17.getType();
        java.lang.String str19 = managementClient17.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "management" + "'", str19, "management");
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
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
            java.lang.String str17 = managementClient15.getPassword("hi!");
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
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
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
            managementClient11.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("hi!", "management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
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
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
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
            managementClient11.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
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
        java.lang.String str11 = managementClient10.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient10);
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
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
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient15);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
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
        java.lang.String str12 = managementClient5.getType();
        java.lang.String str13 = managementClient5.getType();
        java.lang.String str14 = managementClient5.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
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
        java.lang.Class<?> wildcardClass15 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
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
            java.lang.String str17 = managementClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
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
        java.lang.String str12 = managementClient10.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        java.lang.String str14 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = managementClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
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
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
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
        java.lang.String str14 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
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
        login.managementClient managementClient16 = new login.managementClient((login.Client) managementClient15);
        java.lang.Class<?> wildcardClass17 = managementClient16.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
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
            java.lang.String str16 = managementClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
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
        java.lang.Class<?> wildcardClass15 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
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
            managementClient10.register("", "");
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
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        java.lang.String str4 = managementClient2.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient7);
        java.lang.String str9 = managementClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = managementClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management");
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
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "management" + "'", str17, "management");
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = managementClient16.getPassword("hi!");
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
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
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
            managementClient7.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
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
            java.lang.String str18 = managementClient14.getPassword("hi!");
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
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        java.lang.String str4 = managementClient3.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.Class<?> wildcardClass8 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
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
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient4);
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "hi!");
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
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
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
        java.lang.Class<?> wildcardClass12 = managementClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
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
        login.managementClient managementClient20 = new login.managementClient((login.Client) managementClient12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
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
            managementClient10.register("", "", "");
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
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
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
        java.lang.String str12 = managementClient6.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str14 = managementClient13.getType();
        java.lang.String str15 = managementClient13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
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
        java.lang.String str10 = managementClient9.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient5.getType();
        java.lang.String str7 = managementClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient5.register("management", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        java.lang.String str3 = managementClient2.getType();
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient2);
        java.lang.String str5 = managementClient2.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient2);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient2);
        // The following exception was thrown during execution in test generation
        try {
            managementClient8.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
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
            managementClient8.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
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
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
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
        java.lang.String str12 = managementClient5.getType();
        java.lang.Class<?> wildcardClass13 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
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
        java.lang.Class<?> wildcardClass18 = managementClient17.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient17.register("hi!", "", "management");
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
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
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
        java.lang.String str11 = managementClient7.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient7);
        java.lang.Class<?> wildcardClass13 = managementClient7.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
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
        login.managementClient managementClient17 = new login.managementClient((login.Client) managementClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient9.getPassword("");
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
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
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
            managementClient12.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
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
        java.lang.Class<?> wildcardClass11 = managementClient5.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
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
        java.lang.String str12 = managementClient11.getType();
        java.lang.String str13 = managementClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient5);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient5);
        java.lang.String str8 = managementClient7.getType();
        java.lang.String str9 = managementClient7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = managementClient11.getPassword("management");
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
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
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
        java.lang.Class<?> wildcardClass12 = managementClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
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
        java.lang.String str17 = managementClient15.getType();
        java.lang.String str18 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = managementClient15.getPassword("hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        login.managementClient managementClient5 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str6 = managementClient1.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str8 = managementClient1.getType();
        java.lang.String str9 = managementClient1.getType();
        login.managementClient managementClient10 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = managementClient1.getPassword("");
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
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("management", "");
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
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient7);
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("hi!", "hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("management", "management");
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
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = managementClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
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
        java.lang.String str13 = managementClient12.getType();
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient12);
        java.lang.Class<?> wildcardClass15 = managementClient14.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
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
        login.managementClient managementClient14 = new login.managementClient((login.Client) managementClient13);
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
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
        java.lang.String str13 = managementClient3.getType();
        java.lang.String str14 = managementClient3.getType();
        java.lang.Class<?> wildcardClass15 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
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
            managementClient9.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient7.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient4.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient15.register("", "", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient19.register("hi!", "management", "hi!");
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
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
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
        java.lang.Class<?> wildcardClass14 = managementClient13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
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
        java.lang.String str16 = managementClient10.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "management" + "'", str16, "management");
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
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
            java.lang.String str10 = managementClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
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
        java.lang.Class<?> wildcardClass12 = managementClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
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
        java.lang.String str15 = managementClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient14.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "management" + "'", str15, "management");
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
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
        login.managementClient managementClient15 = new login.managementClient((login.Client) managementClient6);
        java.lang.Class<?> wildcardClass16 = managementClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
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
        java.lang.String str17 = managementClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = managementClient15.getPassword("management");
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
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
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
            managementClient11.register("management", "management");
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
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("management", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
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
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        java.lang.String str14 = managementClient13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
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
        java.lang.String str14 = managementClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient10.register("hi!", "hi!", "management");
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
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient(client0);
        login.managementClient managementClient3 = new login.managementClient(client0);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        java.lang.String str6 = managementClient4.getType();
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient8 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient9 = new login.managementClient((login.Client) managementClient8);
        // The following exception was thrown during execution in test generation
        try {
            managementClient9.register("hi!", "management");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
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
            managementClient8.register("hi!", "management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
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
            managementClient10.register("management", "management", "");
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
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
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
        java.lang.String str11 = managementClient8.getType();
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient8);
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient12);
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "management" + "'", str3, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
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
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient9);
        java.lang.Class<?> wildcardClass13 = managementClient12.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
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
        java.lang.String str11 = managementClient8.getType();
        java.lang.String str12 = managementClient8.getType();
        java.lang.Class<?> wildcardClass13 = managementClient8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
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
        java.lang.String str13 = managementClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient12.register("management", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "management" + "'", str9, "management");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "management" + "'", str13, "management");
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient3.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient3);
        // The following exception was thrown during execution in test generation
        try {
            managementClient3.register("hi!", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "management" + "'", str10, "management");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "management" + "'", str11, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
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
        java.lang.String str12 = managementClient10.getType();
        login.managementClient managementClient13 = new login.managementClient((login.Client) managementClient10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "management" + "'", str6, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "management" + "'", str12, "management");
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        java.lang.String str2 = managementClient1.getType();
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        java.lang.String str4 = managementClient1.getType();
        java.lang.String str5 = managementClient1.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient1);
        // The following exception was thrown during execution in test generation
        try {
            managementClient1.register("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "management" + "'", str2, "management");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "management" + "'", str4, "management");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
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
        login.managementClient managementClient12 = new login.managementClient((login.Client) managementClient11);
        // The following exception was thrown during execution in test generation
        try {
            managementClient11.register("", "management", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        login.Client client0 = null;
        login.managementClient managementClient1 = new login.managementClient(client0);
        login.managementClient managementClient2 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient3 = new login.managementClient((login.Client) managementClient1);
        login.managementClient managementClient4 = new login.managementClient((login.Client) managementClient3);
        java.lang.String str5 = managementClient4.getType();
        login.managementClient managementClient6 = new login.managementClient((login.Client) managementClient4);
        login.managementClient managementClient7 = new login.managementClient((login.Client) managementClient6);
        java.lang.String str8 = managementClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient6.register("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "management" + "'", str8, "management");
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
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
            managementClient12.register("", "");
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
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
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
            java.lang.String str20 = managementClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "management" + "'", str18, "management");
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
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
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "hi!");
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
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
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
        java.lang.String str14 = managementClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            managementClient13.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "management" + "'", str5, "management");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "management" + "'", str7, "management");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "management" + "'", str14, "management");
    }
}

