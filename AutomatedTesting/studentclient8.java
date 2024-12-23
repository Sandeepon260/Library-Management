package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class studentclient8 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        java.lang.Class<?> wildcardClass16 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        java.lang.String str15 = studentClient14.getType();
        java.lang.String str16 = studentClient14.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        java.lang.String str14 = studentClient10.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str9 = studentClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass16 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        login.StudentClient studentClient21 = new login.StudentClient((login.Client) studentClient19);
        login.StudentClient studentClient22 = new login.StudentClient((login.Client) studentClient21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
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
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        java.lang.String str13 = studentClient11.getType();
        java.lang.Class<?> wildcardClass14 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str9 = studentClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = studentClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        java.lang.String str13 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("Student", "hi!", "");
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
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str13 = studentClient9.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        java.lang.String str11 = studentClient10.getType();
        java.lang.String str12 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str16 = studentClient12.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient18 = new login.StudentClient((login.Client) studentClient17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        java.lang.Class<?> wildcardClass10 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        login.StudentClient studentClient20 = new login.StudentClient((login.Client) studentClient19);
        // The following exception was thrown during execution in test generation
        try {
            studentClient20.register("", "", "");
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
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        java.lang.String str15 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient4);
        java.lang.Class<?> wildcardClass13 = studentClient4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        java.lang.Class<?> wildcardClass10 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass15 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
        java.lang.String str11 = studentClient9.getType();
        java.lang.Class<?> wildcardClass12 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        java.lang.String str7 = studentClient3.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        java.lang.String str13 = studentClient10.getType();
        java.lang.Class<?> wildcardClass14 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
            java.lang.String str15 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        java.lang.String str14 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
            java.lang.String str9 = studentClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        java.lang.String str15 = studentClient14.getType();
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("", "Student", "");
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
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient16);
        // The following exception was thrown during execution in test generation
        try {
            studentClient17.register("Student", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        java.lang.String str19 = studentClient18.getType();
        java.lang.String str20 = studentClient18.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        java.lang.String str12 = studentClient8.getType();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        java.lang.String str13 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        java.lang.Class<?> wildcardClass11 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        java.lang.String str12 = studentClient5.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str14 = studentClient13.getType();
        java.lang.Class<?> wildcardClass15 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        java.lang.String str13 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str6 = studentClient5.getType();
        java.lang.String str7 = studentClient5.getType();
        java.lang.String str8 = studentClient5.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
            studentClient12.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        java.lang.String str10 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str15 = studentClient14.getType();
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = studentClient2.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = studentClient3.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        java.lang.String str11 = studentClient8.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str13 = studentClient8.getType();
        java.lang.String str14 = studentClient8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient16);
        login.StudentClient studentClient18 = new login.StudentClient((login.Client) studentClient16);
        java.lang.String str19 = studentClient18.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient6.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
            java.lang.String str10 = studentClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
        java.lang.String str14 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str14 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        java.lang.String str10 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        java.lang.String str13 = studentClient7.getType();
        java.lang.String str14 = studentClient7.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("hi!", "", "Student");
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
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        java.lang.Class<?> wildcardClass7 = studentClient2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str16 = studentClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        java.lang.Class<?> wildcardClass10 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient16.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = studentClient17.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        java.lang.String str11 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        java.lang.String str14 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str9 = studentClient2.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        java.lang.String str13 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        java.lang.String str11 = studentClient8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        java.lang.Class<?> wildcardClass15 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "hi!", "");
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
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        java.lang.Class<?> wildcardClass16 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        java.lang.String str14 = studentClient12.getType();
        java.lang.Class<?> wildcardClass15 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "", "hi!");
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
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        java.lang.String str13 = studentClient11.getType();
        java.lang.String str14 = studentClient11.getType();
        java.lang.Class<?> wildcardClass15 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        java.lang.String str12 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        java.lang.String str15 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        java.lang.Class<?> wildcardClass16 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        java.lang.String str13 = studentClient12.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
            java.lang.String str17 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str6 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient7.getPassword("hi!");
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
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        java.lang.Class<?> wildcardClass10 = studentClient4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "", "Student");
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
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str11 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        java.lang.String str12 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient4);
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
        java.lang.Class<?> wildcardClass15 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        java.lang.String str2 = studentClient1.getType();
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student" + "'", str2, "Student");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str8 = studentClient5.getType();
        java.lang.String str9 = studentClient5.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        java.lang.String str14 = studentClient12.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str16 = studentClient12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient4.getType();
        java.lang.String str10 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        java.lang.String str12 = studentClient10.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        java.lang.Class<?> wildcardClass14 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str14 = studentClient13.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        java.lang.String str13 = studentClient11.getType();
        java.lang.Class<?> wildcardClass14 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient18.register("Student", "", "");
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
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        login.StudentClient studentClient19 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str20 = studentClient19.getType();
        login.StudentClient studentClient21 = new login.StudentClient((login.Client) studentClient19);
        login.StudentClient studentClient22 = new login.StudentClient((login.Client) studentClient19);
        // The following exception was thrown during execution in test generation
        try {
            studentClient19.register("", "hi!", "");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("hi!", "Student", "Student");
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
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
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
        java.lang.String str10 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
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
        java.lang.String str13 = studentClient4.getType();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str9 = studentClient2.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str12 = studentClient2.getType();
        java.lang.String str13 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient10);
        java.lang.Class<?> wildcardClass15 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        java.lang.Class<?> wildcardClass5 = studentClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.Class<?> wildcardClass7 = studentClient4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        java.lang.Class<?> wildcardClass11 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str16 = studentClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        java.lang.String str13 = studentClient7.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient14.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
        java.lang.Class<?> wildcardClass10 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "Student", "");
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
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str14 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
        java.lang.String str13 = studentClient8.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        java.lang.String str14 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        java.lang.String str13 = studentClient7.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str16 = studentClient15.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient15);
        java.lang.String str18 = studentClient15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
            studentClient8.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        java.lang.String str6 = studentClient3.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.Class<?> wildcardClass10 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        java.lang.String str15 = studentClient12.getType();
        java.lang.String str16 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        java.lang.String str2 = studentClient1.getType();
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student" + "'", str2, "Student");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        java.lang.String str11 = studentClient8.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str14 = studentClient13.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient3.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        java.lang.String str12 = studentClient7.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
            studentClient15.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "Student", "hi!");
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
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
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
        java.lang.String str11 = studentClient9.getType();
        java.lang.Class<?> wildcardClass12 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
            studentClient12.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
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
        java.lang.String str12 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
            studentClient11.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        java.lang.String str13 = studentClient12.getType();
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
            studentClient6.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        java.lang.Class<?> wildcardClass7 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
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
        java.lang.String str10 = studentClient6.getType();
        java.lang.String str11 = studentClient6.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        java.lang.String str10 = studentClient2.getType();
        java.lang.String str11 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str11 = studentClient6.getType();
        java.lang.String str12 = studentClient6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        java.lang.String str19 = studentClient18.getType();
        login.StudentClient studentClient20 = new login.StudentClient((login.Client) studentClient18);
        login.StudentClient studentClient21 = new login.StudentClient((login.Client) studentClient18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = studentClient18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        java.lang.String str10 = studentClient7.getType();
        java.lang.Class<?> wildcardClass11 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str15 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
            studentClient6.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        java.lang.String str15 = studentClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "", "");
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
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        java.lang.String str17 = studentClient16.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
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
        java.lang.String str19 = studentClient18.getType();
        login.StudentClient studentClient20 = new login.StudentClient((login.Client) studentClient18);
        login.StudentClient studentClient21 = new login.StudentClient((login.Client) studentClient18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = studentClient18.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        java.lang.String str12 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        java.lang.String str19 = studentClient18.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = studentClient18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str14 = studentClient13.getType();
        java.lang.String str15 = studentClient13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass10 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient15.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str8 = studentClient5.getType();
        java.lang.Class<?> wildcardClass9 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient12.getPassword("Student");
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
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        java.lang.String str14 = studentClient13.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str16 = studentClient15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str8 = studentClient5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient10.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("hi!", "hi!", "hi!");
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
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str13 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass11 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
            studentClient7.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
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
            studentClient3.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        java.lang.String str12 = studentClient9.getType();
        java.lang.Class<?> wildcardClass13 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
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
        java.lang.Class<?> wildcardClass15 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str13 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient17.register("hi!", "hi!", "hi!");
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
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str15 = studentClient14.getType();
        java.lang.String str16 = studentClient14.getType();
        java.lang.Class<?> wildcardClass17 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
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
        login.StudentClient studentClient19 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str20 = studentClient19.getType();
        java.lang.String str21 = studentClient19.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Student" + "'", str21, "Student");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
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
        java.lang.String str11 = studentClient10.getType();
        java.lang.String str12 = studentClient10.getType();
        java.lang.Class<?> wildcardClass13 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient3.getType();
        java.lang.String str8 = studentClient3.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
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
        java.lang.String str10 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient6.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        java.lang.String str13 = studentClient11.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("", "hi!", "hi!");
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
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "", "");
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
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        java.lang.String str14 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
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
            studentClient6.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
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
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("Student");
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
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass9 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
            java.lang.String str14 = studentClient12.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
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
        java.lang.String str10 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
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
        java.lang.String str10 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        java.lang.String str7 = studentClient2.getType();
        java.lang.Class<?> wildcardClass8 = studentClient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str11 = studentClient6.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str13 = studentClient12.getType();
        java.lang.String str14 = studentClient12.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        java.lang.String str13 = studentClient11.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient1.getType();
        java.lang.String str5 = studentClient1.getType();
        java.lang.String str6 = studentClient1.getType();
        java.lang.String str7 = studentClient1.getType();
        java.lang.String str8 = studentClient1.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        java.lang.String str11 = studentClient8.getType();
        java.lang.String str12 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str9 = studentClient5.getType();
        java.lang.String str10 = studentClient5.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass7 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
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
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str13 = studentClient9.getType();
        java.lang.Class<?> wildcardClass14 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str12 = studentClient4.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient4);
        java.lang.Class<?> wildcardClass14 = studentClient4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient1.getType();
        java.lang.String str5 = studentClient1.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str7 = studentClient6.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
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
        java.lang.String str10 = studentClient6.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
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
        java.lang.String str18 = studentClient11.getType();
        java.lang.String str19 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
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
            java.lang.String str11 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        java.lang.String str10 = studentClient6.getType();
        java.lang.String str11 = studentClient6.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str13 = studentClient6.getType();
        java.lang.Class<?> wildcardClass14 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
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
        java.lang.String str13 = studentClient4.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient4);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
        java.lang.String str14 = studentClient13.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient13.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient8.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient14);
        java.lang.String str17 = studentClient14.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient15.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.Class<?> wildcardClass7 = studentClient6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("hi!", "hi!", "Student");
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
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
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
            java.lang.String str14 = studentClient12.getPassword("");
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
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
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
        java.lang.Class<?> wildcardClass12 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
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
        java.lang.String str13 = studentClient8.getType();
        java.lang.String str14 = studentClient8.getType();
        java.lang.Class<?> wildcardClass15 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        java.lang.String str7 = studentClient2.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.Class<?> wildcardClass11 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str14 = studentClient13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.String str9 = studentClient7.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str12 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str13 = studentClient12.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient5.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient6.getPassword("Student");
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
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        java.lang.String str14 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        java.lang.Class<?> wildcardClass11 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass15 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient13);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        java.lang.String str2 = studentClient1.getType();
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient3.getType();
        java.lang.Class<?> wildcardClass6 = studentClient3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student" + "'", str2, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        java.lang.String str15 = studentClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
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
        java.lang.String str12 = studentClient8.getType();
        java.lang.String str13 = studentClient8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
        java.lang.String str11 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        java.lang.String str7 = studentClient3.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        java.lang.String str16 = studentClient14.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient12.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
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
        java.lang.Class<?> wildcardClass16 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        java.lang.String str7 = studentClient5.getType();
        java.lang.String str8 = studentClient5.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        java.lang.String str7 = studentClient2.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str9 = studentClient2.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
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
        java.lang.String str13 = studentClient7.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str16 = studentClient15.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient15);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        java.lang.String str15 = studentClient14.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient6.getType();
        java.lang.Class<?> wildcardClass10 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
        java.lang.String str11 = studentClient9.getType();
        java.lang.Class<?> wildcardClass12 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
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
            studentClient11.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str11 = studentClient10.getType();
        java.lang.String str12 = studentClient10.getType();
        java.lang.String str13 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        java.lang.String str14 = studentClient8.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient8.getPassword("Student");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str13 = studentClient12.getType();
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
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
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
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
        java.lang.String str19 = studentClient18.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = studentClient18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        java.lang.Class<?> wildcardClass17 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str9 = studentClient6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
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
        java.lang.Class<?> wildcardClass10 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
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
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
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
        java.lang.Class<?> wildcardClass11 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        java.lang.String str12 = studentClient11.getType();
        java.lang.String str13 = studentClient11.getType();
        java.lang.String str14 = studentClient11.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass16 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.Class<?> wildcardClass9 = studentClient8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
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
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient16);
        java.lang.String str18 = studentClient17.getType();
        java.lang.String str19 = studentClient17.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
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
        java.lang.String str14 = studentClient10.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        java.lang.String str6 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
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
        java.lang.String str14 = studentClient10.getType();
        java.lang.String str15 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient9.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient9);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
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
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient2.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        java.lang.String str10 = studentClient2.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str12 = studentClient2.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.Class<?> wildcardClass10 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
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
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass16 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
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
        java.lang.String str12 = studentClient9.getType();
        java.lang.Class<?> wildcardClass13 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
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
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
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
        java.lang.String str10 = studentClient8.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass17 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str13 = studentClient3.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        java.lang.String str13 = studentClient10.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str15 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        java.lang.Class<?> wildcardClass9 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        java.lang.String str6 = studentClient3.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str12 = studentClient5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass7 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient(client0);
        login.StudentClient studentClient5 = new login.StudentClient(client0);
        login.StudentClient studentClient6 = new login.StudentClient(client0);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient6.getPassword("Student");
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
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
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
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
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
        java.lang.String str20 = studentClient17.getType();
        login.StudentClient studentClient21 = new login.StudentClient((login.Client) studentClient17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = studentClient17.getPassword("Student");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
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
            studentClient11.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
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
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient14);
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient14);
        java.lang.String str18 = studentClient17.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient17.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
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
        java.lang.String str12 = studentClient8.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient12.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("Student", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
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
        java.lang.String str13 = studentClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str10 = studentClient6.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
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
        java.lang.String str13 = studentClient8.getType();
        java.lang.String str14 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient8.getPassword("");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        login.StudentClient studentClient20 = new login.StudentClient((login.Client) studentClient19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = studentClient19.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient7.getType();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass11 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient4.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        java.lang.Class<?> wildcardClass13 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str12 = studentClient6.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
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
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        java.lang.String str17 = studentClient16.getType();
        java.lang.String str18 = studentClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient16.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
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
        java.lang.String str12 = studentClient11.getType();
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass7 = studentClient5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        java.lang.String str17 = studentClient16.getType();
        java.lang.Class<?> wildcardClass18 = studentClient16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
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
        java.lang.Class<?> wildcardClass11 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
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
        java.lang.String str14 = studentClient13.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        java.lang.String str16 = studentClient15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
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
        java.lang.String str10 = studentClient9.getType();
        java.lang.String str11 = studentClient9.getType();
        java.lang.String str12 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        java.lang.String str16 = studentClient14.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str10 = studentClient9.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient7.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
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
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient11.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
        java.lang.Class<?> wildcardClass18 = studentClient16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
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
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
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
        java.lang.Class<?> wildcardClass14 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
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
        java.lang.String str10 = studentClient6.getType();
        java.lang.String str11 = studentClient6.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient12);
        java.lang.String str16 = studentClient12.getType();
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
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
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
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
            studentClient7.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
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
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient11);
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient16);
        java.lang.Class<?> wildcardClass18 = studentClient17.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient7.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
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
        java.lang.String str18 = studentClient15.getType();
        java.lang.String str19 = studentClient15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Student" + "'", str19, "Student");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
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
        java.lang.String str13 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
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
        java.lang.String str11 = studentClient9.getType();
        java.lang.String str12 = studentClient9.getType();
        java.lang.String str13 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
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
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = studentClient16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
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
            java.lang.String str11 = studentClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
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
        java.lang.String str18 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
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
        java.lang.String str14 = studentClient13.getType();
        java.lang.Class<?> wildcardClass15 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
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
        java.lang.String str15 = studentClient9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str9 = studentClient8.getType();
        java.lang.String str10 = studentClient8.getType();
        java.lang.Class<?> wildcardClass11 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str13 = studentClient11.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient11.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
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
        java.lang.String str11 = studentClient9.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str13 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
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
        java.lang.String str13 = studentClient10.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass16 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient3.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
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
        java.lang.String str13 = studentClient7.getType();
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient15.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        java.lang.String str9 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.Class<?> wildcardClass10 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
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
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
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
            studentClient5.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass15 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
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
        java.lang.String str12 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient8.getPassword("");
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
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient2.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str10 = studentClient6.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        java.lang.String str14 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str10 = studentClient9.getType();
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
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
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
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
        java.lang.String str18 = studentClient11.getType();
        login.StudentClient studentClient19 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass20 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Student" + "'", str18, "Student");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str14 = studentClient13.getType();
        java.lang.Class<?> wildcardClass15 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
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
        login.StudentClient studentClient20 = new login.StudentClient((login.Client) studentClient19);
        // The following exception was thrown during execution in test generation
        try {
            studentClient20.register("", "", "hi!");
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
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str6 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient2.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        java.lang.String str2 = studentClient1.getType();
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Student" + "'", str2, "Student");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.Class<?> wildcardClass8 = studentClient2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
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
            studentClient8.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
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
        java.lang.String str14 = studentClient10.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient10);
        java.lang.Class<?> wildcardClass16 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
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
        login.StudentClient studentClient19 = new login.StudentClient((login.Client) studentClient15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
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
        java.lang.String str10 = studentClient9.getType();
        java.lang.Class<?> wildcardClass11 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
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
        java.lang.String str16 = studentClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str16 = studentClient15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        java.lang.Class<?> wildcardClass8 = studentClient4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}
