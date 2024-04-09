package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class studentclient7 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
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
            studentClient11.register("", "", "");
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
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
        java.lang.Class<?> wildcardClass13 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient15);
        // The following exception was thrown during execution in test generation
        try {
            studentClient16.register("", "hi!", "hi!");
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
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
            java.lang.String str14 = studentClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("Student");
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
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("Student", "Student", "");
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
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        java.lang.String str15 = studentClient14.getType();
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = studentClient14.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        login.StudentClient studentClient20 = new login.StudentClient((login.Client) studentClient18);
        java.lang.Class<?> wildcardClass21 = studentClient20.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        java.lang.String str14 = studentClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        java.lang.Class<?> wildcardClass11 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
            studentClient6.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
            java.lang.String str13 = studentClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str11 = studentClient10.getType();
        java.lang.String str12 = studentClient10.getType();
        java.lang.String str13 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "Student", "hi!");
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
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
        java.lang.String str15 = studentClient12.getType();
        java.lang.String str16 = studentClient12.getType();
        java.lang.String str17 = studentClient12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        java.lang.Class<?> wildcardClass11 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient2.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        java.lang.String str11 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        java.lang.String str12 = studentClient9.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str6 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.String str14 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
            java.lang.String str14 = studentClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient6);
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
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient10);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
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
        java.lang.String str19 = studentClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = studentClient15.getPassword("Student");
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
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        java.lang.String str7 = studentClient4.getType();
        java.lang.String str8 = studentClient4.getType();
        java.lang.String str9 = studentClient4.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
            studentClient10.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        java.lang.String str13 = studentClient7.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        java.lang.String str11 = studentClient8.getType();
        java.lang.Class<?> wildcardClass12 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        java.lang.String str10 = studentClient7.getType();
        java.lang.String str11 = studentClient7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        login.StudentClient studentClient20 = new login.StudentClient((login.Client) studentClient18);
        login.StudentClient studentClient21 = new login.StudentClient((login.Client) studentClient20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        java.lang.String str15 = studentClient12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
        java.lang.String str11 = studentClient10.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        java.lang.Class<?> wildcardClass13 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        java.lang.String str14 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        java.lang.String str14 = studentClient9.getType();
        java.lang.String str15 = studentClient9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("hi!", "hi!", "Student");
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
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
        java.lang.String str13 = studentClient10.getType();
        java.lang.String str14 = studentClient10.getType();
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient10);
        java.lang.Class<?> wildcardClass16 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient10.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        java.lang.String str14 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str12 = studentClient11.getType();
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass14 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
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
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
        login.StudentClient studentClient17 = new login.StudentClient((login.Client) studentClient15);
        login.StudentClient studentClient18 = new login.StudentClient((login.Client) studentClient17);
        // The following exception was thrown during execution in test generation
        try {
            studentClient18.register("Student", "hi!", "");
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
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        java.lang.String str11 = studentClient8.getType();
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
        login.StudentClient studentClient14 = new login.StudentClient((login.Client) studentClient12);
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
            studentClient7.register("hi!", "", "Student");
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
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        java.lang.String str11 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient8);
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("Student");
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
}

