package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class studentclient4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        java.lang.Class<?> wildcardClass9 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient5.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        java.lang.String str16 = studentClient15.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient15);
        java.lang.String str18 = studentClient17.getType();
        login.StudentClient studentClient19 = new login.StudentClient((login.Client) studentClient17);
        login.StudentClient studentClient20 = new login.StudentClient((login.Client) studentClient17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = studentClient20.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        java.lang.String str9 = studentClient6.getType();
        java.lang.String str10 = studentClient6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str13 = studentClient12.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass15 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        java.lang.String str12 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str11 = studentClient8.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str9 = studentClient2.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str11 = studentClient10.getType();
        java.lang.Class<?> wildcardClass12 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        java.lang.Class<?> wildcardClass11 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str14 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient3.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str10 = studentClient9.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str14 = studentClient11.getType();
        java.lang.Class<?> wildcardClass15 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass11 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        java.lang.String str14 = studentClient11.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str16 = studentClient11.getType();
        java.lang.String str17 = studentClient11.getType();
        login.StudentClient studentClient18 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient19 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient19.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        java.lang.String str17 = studentClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient3.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str14 = studentClient13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        java.lang.String str14 = studentClient11.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str16 = studentClient11.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient18 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass19 = studentClient18.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient4.getType();
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient4.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str9 = studentClient5.getType();
        java.lang.Class<?> wildcardClass10 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient10.getType();
        java.lang.String str12 = studentClient10.getType();
        java.lang.Class<?> wildcardClass13 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = studentClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient2.getType();
        java.lang.String str9 = studentClient2.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient10.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient4.getType();
        java.lang.String str10 = studentClient4.getType();
        java.lang.String str11 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass15 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str6 = studentClient2.getType();
        java.lang.String str7 = studentClient2.getType();
        java.lang.Class<?> wildcardClass8 = studentClient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        java.lang.String str6 = studentClient3.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.Class<?> wildcardClass8 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str13 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.Class<?> wildcardClass9 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = studentClient16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient3.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient9.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient12.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        java.lang.String str6 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = studentClient4.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("hi!", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str13 = studentClient10.getType();
        java.lang.Class<?> wildcardClass14 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient2.getType();
        java.lang.String str8 = studentClient2.getType();
        java.lang.String str9 = studentClient2.getType();
        java.lang.String str10 = studentClient2.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient14.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str13 = studentClient9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient7.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient4.getType();
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient12.getType();
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient2.getType();
        java.lang.String str9 = studentClient2.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass11 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str12 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        java.lang.String str7 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient5.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient5.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str11 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str15 = studentClient14.getType();
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient14);
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = studentClient17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        java.lang.String str9 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient3.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str13 = studentClient12.getType();
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str12 = studentClient7.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient7);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient4.getType();
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient4.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient2.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient10.getType();
        java.lang.String str13 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str12 = studentClient4.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str15 = studentClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient13.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass15 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str11 = studentClient8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient2.getType();
        java.lang.String str9 = studentClient2.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str8 = studentClient5.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        java.lang.Class<?> wildcardClass7 = studentClient3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str15 = studentClient14.getType();
        java.lang.Class<?> wildcardClass16 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient6.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        java.lang.String str6 = studentClient3.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient2.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        java.lang.Class<?> wildcardClass13 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str15 = studentClient13.getType();
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = studentClient16.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str12 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient7.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str15 = studentClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str12 = studentClient7.getType();
        java.lang.String str13 = studentClient7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient6.getType();
        java.lang.String str10 = studentClient6.getType();
        java.lang.String str11 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient6.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str9 = studentClient5.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str14 = studentClient10.getType();
        java.lang.Class<?> wildcardClass15 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str13 = studentClient9.getType();
        java.lang.String str14 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str13 = studentClient9.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient1.getType();
        java.lang.String str5 = studentClient1.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient1);
        java.lang.Class<?> wildcardClass7 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        java.lang.Class<?> wildcardClass9 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient9.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient5.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        java.lang.String str16 = studentClient15.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient15);
        java.lang.String str18 = studentClient17.getType();
        login.StudentClient studentClient19 = new login.StudentClient((login.Client) studentClient17);
        java.lang.String str20 = studentClient19.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient19.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.Class<?> wildcardClass8 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient10.getType();
        java.lang.String str12 = studentClient10.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str14 = studentClient13.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient9.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass15 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient9.getType();
        java.lang.String str13 = studentClient9.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient10.getType();
        java.lang.Class<?> wildcardClass12 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str14 = studentClient13.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str16 = studentClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = studentClient15.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        java.lang.String str9 = studentClient6.getType();
        java.lang.String str10 = studentClient6.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str15 = studentClient13.getType();
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            studentClient16.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        java.lang.String str14 = studentClient11.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str16 = studentClient15.getType();
        java.lang.Class<?> wildcardClass17 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        java.lang.String str16 = studentClient15.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient15);
        java.lang.String str18 = studentClient17.getType();
        login.StudentClient studentClient19 = new login.StudentClient((login.Client) studentClient17);
        java.lang.String str20 = studentClient19.getType();
        java.lang.Class<?> wildcardClass21 = studentClient19.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        java.lang.String str11 = studentClient8.getType();
        java.lang.String str12 = studentClient8.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str14 = studentClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient9.getType();
        java.lang.String str12 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        java.lang.String str9 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str11 = studentClient10.getType();
        java.lang.String str12 = studentClient10.getType();
        java.lang.Class<?> wildcardClass13 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        java.lang.Class<?> wildcardClass7 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str14 = studentClient11.getType();
        java.lang.Class<?> wildcardClass15 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str13 = studentClient12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        java.lang.String str9 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass11 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str17 = studentClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient16.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str13 = studentClient9.getType();
        java.lang.String str14 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        java.lang.String str11 = studentClient8.getType();
        java.lang.Class<?> wildcardClass12 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient4.getType();
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient4.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str13 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass11 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        // The following exception was thrown during execution in test generation
        try {
            studentClient16.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass7 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient7.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.Class<?> wildcardClass10 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        java.lang.Class<?> wildcardClass7 = studentClient2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient3.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.Class<?> wildcardClass12 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.Class<?> wildcardClass12 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str11 = studentClient8.getType();
        java.lang.String str12 = studentClient8.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str11 = studentClient8.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str13 = studentClient12.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        java.lang.String str10 = studentClient7.getType();
        java.lang.Class<?> wildcardClass11 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient8.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str8 = studentClient5.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient2.getType();
        java.lang.String str9 = studentClient2.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass11 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str14 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        java.lang.String str11 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        java.lang.String str14 = studentClient11.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str16 = studentClient11.getType();
        java.lang.String str17 = studentClient11.getType();
        login.StudentClient studentClient18 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient19 = new login.StudentClient((login.Client) studentClient18);
        java.lang.Class<?> wildcardClass20 = studentClient19.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient5.getType();
        java.lang.String str11 = studentClient5.getType();
        java.lang.String str12 = studentClient5.getType();
        java.lang.String str13 = studentClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient9.getType();
        java.lang.String str12 = studentClient9.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient12.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        java.lang.Class<?> wildcardClass13 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        java.lang.Class<?> wildcardClass10 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str14 = studentClient12.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass16 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient11.getType();
        java.lang.String str13 = studentClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("Student", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        java.lang.String str14 = studentClient11.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str16 = studentClient11.getType();
        java.lang.String str17 = studentClient11.getType();
        login.StudentClient studentClient18 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient19 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient19.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str12 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass12 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient10.getType();
        java.lang.String str12 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        java.lang.String str7 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        java.lang.String str6 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient3.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient2.getType();
        java.lang.String str9 = studentClient2.getType();
        java.lang.String str10 = studentClient2.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str13 = studentClient12.getType();
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient14.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient3.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient3.getType();
        java.lang.String str6 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("hi!", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient5.getType();
        java.lang.String str11 = studentClient5.getType();
        java.lang.String str12 = studentClient5.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str14 = studentClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient2.getType();
        java.lang.String str9 = studentClient2.getType();
        java.lang.String str10 = studentClient2.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        java.lang.String str8 = studentClient4.getType();
        java.lang.String str9 = studentClient4.getType();
        java.lang.Class<?> wildcardClass10 = studentClient4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        java.lang.String str16 = studentClient15.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient15);
        java.lang.String str18 = studentClient17.getType();
        java.lang.Class<?> wildcardClass19 = studentClient17.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str14 = studentClient13.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str16 = studentClient13.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str18 = studentClient13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str11 = studentClient10.getType();
        java.lang.String str12 = studentClient10.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass8 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.Class<?> wildcardClass10 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        java.lang.String str11 = studentClient8.getType();
        java.lang.String str12 = studentClient8.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str14 = studentClient13.getType();
        java.lang.Class<?> wildcardClass15 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = studentClient3.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str13 = studentClient12.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient10.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient6.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str14 = studentClient13.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        java.lang.Class<?> wildcardClass16 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.Class<?> wildcardClass7 = studentClient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str11 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        java.lang.String str10 = studentClient7.getType();
        java.lang.String str11 = studentClient7.getType();
        java.lang.Class<?> wildcardClass12 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient2.getType();
        java.lang.String str8 = studentClient2.getType();
        java.lang.String str9 = studentClient2.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient10.getType();
        java.lang.Class<?> wildcardClass13 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient6.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("Student", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient6.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient12.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient14.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str14 = studentClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str11 = studentClient8.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient3.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient9.getType();
        java.lang.String str13 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient3.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str9 = studentClient3.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str11 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.Class<?> wildcardClass9 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.Class<?> wildcardClass10 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.Class<?> wildcardClass8 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        java.lang.String str9 = studentClient6.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass11 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        java.lang.String str2 = studentClient1.getType();
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = studentClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student" + "'", str2, "Student");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient4.getType();
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        java.lang.String str14 = studentClient11.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str16 = studentClient15.getType();
        java.lang.String str17 = studentClient15.getType();
        login.StudentClient studentClient18 = new login.StudentClient((login.Client) studentClient15);
        // The following exception was thrown during execution in test generation
        try {
            studentClient18.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient2.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str9 = studentClient2.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str11 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient6.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass11 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        java.lang.String str16 = studentClient15.getType();
        java.lang.Class<?> wildcardClass17 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient9.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str14 = studentClient9.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass16 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        java.lang.String str11 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str13 = studentClient12.getType();
        java.lang.String str14 = studentClient12.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str13 = studentClient12.getType();
        java.lang.String str14 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient9.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        java.lang.String str9 = studentClient3.getType();
        java.lang.Class<?> wildcardClass10 = studentClient3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient6.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient10.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass15 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient1.getType();
        java.lang.String str5 = studentClient1.getType();
        java.lang.String str6 = studentClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient1.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = studentClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        java.lang.String str7 = studentClient5.getType();
        java.lang.Class<?> wildcardClass8 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient4.getType();
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient4.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient2.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str9 = studentClient2.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient10.getType();
        java.lang.String str13 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient6.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient11.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient4.getType();
        java.lang.String str10 = studentClient4.getType();
        java.lang.String str11 = studentClient4.getType();
        java.lang.String str12 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass9 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str12 = studentClient6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str11 = studentClient8.getType();
        java.lang.String str12 = studentClient8.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("hi!", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient3.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient4.getType();
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str12 = studentClient4.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient4.getType();
        java.lang.String str12 = studentClient4.getType();
        java.lang.String str13 = studentClient4.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str9 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        java.lang.Class<?> wildcardClass9 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str13 = studentClient12.getType();
        java.lang.String str14 = studentClient12.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass16 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        java.lang.String str11 = studentClient8.getType();
        java.lang.Class<?> wildcardClass12 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("hi!", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str11 = studentClient7.getType();
        java.lang.String str12 = studentClient7.getType();
        java.lang.String str13 = studentClient7.getType();
        java.lang.String str14 = studentClient7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient3.getType();
        java.lang.String str6 = studentClient3.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("Student", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient9.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str14 = studentClient9.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass16 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str12 = studentClient4.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str12 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str14 = studentClient12.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str11 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        java.lang.String str14 = studentClient11.getType();
        java.lang.String str15 = studentClient11.getType();
        java.lang.String str16 = studentClient11.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient18 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass19 = studentClient18.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str8 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str14 = studentClient13.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass11 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass9 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str14 = studentClient13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        java.lang.String str11 = studentClient8.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str13 = studentClient8.getType();
        java.lang.Class<?> wildcardClass14 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient13);
        java.lang.Class<?> wildcardClass17 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        java.lang.String str8 = studentClient4.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        java.lang.String str9 = studentClient6.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str12 = studentClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        java.lang.String str7 = studentClient2.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient14.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        java.lang.String str14 = studentClient11.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str16 = studentClient11.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient18 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient18.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        java.lang.String str9 = studentClient6.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        java.lang.String str14 = studentClient11.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str16 = studentClient11.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient18 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass19 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient5.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass7 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str15 = studentClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient4.getType();
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient4.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str13 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass11 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass14 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        java.lang.String str8 = studentClient4.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str13 = studentClient9.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str15 = studentClient14.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient10.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str14 = studentClient12.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = studentClient16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient3.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str13 = studentClient12.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass15 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str14 = studentClient13.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str16 = studentClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = studentClient15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str6 = studentClient2.getType();
        java.lang.String str7 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient3.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient3);
        java.lang.Class<?> wildcardClass11 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient10.getType();
        java.lang.String str12 = studentClient10.getType();
        java.lang.String str13 = studentClient10.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass9 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.Class<?> wildcardClass10 = studentClient9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient2.getType();
        java.lang.String str9 = studentClient2.getType();
        java.lang.String str10 = studentClient2.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str12 = studentClient2.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient4.getType();
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str13 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        java.lang.Class<?> wildcardClass9 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str14 = studentClient13.getType();
        java.lang.String str15 = studentClient13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = studentClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.Class<?> wildcardClass11 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        java.lang.String str11 = studentClient8.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        java.lang.Class<?> wildcardClass15 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str13 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient3.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str12 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str13 = studentClient9.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient3.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.Class<?> wildcardClass8 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str13 = studentClient9.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str16 = studentClient9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str11 = studentClient10.getType();
        java.lang.Class<?> wildcardClass12 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str14 = studentClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient3.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient3);
        java.lang.Class<?> wildcardClass12 = studentClient3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        java.lang.String str11 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient4.getType();
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str12 = studentClient4.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient4.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str8 = studentClient5.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass14 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.Class<?> wildcardClass7 = studentClient4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        java.lang.Class<?> wildcardClass11 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient2.getType();
        java.lang.String str9 = studentClient2.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str11 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient7.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient14.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient3.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        java.lang.String str13 = studentClient11.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient14.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }
}

