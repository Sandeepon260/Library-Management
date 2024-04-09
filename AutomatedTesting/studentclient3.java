package AutomatedTesting;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class studentclient3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
            java.lang.String str11 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        java.lang.Class<?> wildcardClass10 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        java.lang.Class<?> wildcardClass18 = studentClient16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.Class<?> wildcardClass6 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
            studentClient7.register("Student", "", "hi!");
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
            java.lang.String str12 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        java.lang.String str15 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        java.lang.Class<?> wildcardClass18 = studentClient17.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
            studentClient12.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient8.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
            studentClient8.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
            java.lang.String str20 = studentClient18.getPassword("hi!");
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
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient18.register("", "", "");
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
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "", "Student");
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        java.lang.String str6 = studentClient3.getType();
        java.lang.String str7 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        java.lang.String str14 = studentClient12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
            java.lang.String str9 = studentClient7.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        java.lang.Class<?> wildcardClass15 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
            java.lang.String str21 = studentClient19.getPassword("");
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
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        java.lang.String str8 = studentClient5.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("hi!", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
            studentClient12.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        java.lang.Class<?> wildcardClass20 = studentClient18.getClass();
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
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("Student", "Student", "hi!");
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        java.lang.String str12 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient5.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
            studentClient8.register("Student", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        java.lang.Class<?> wildcardClass10 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
            studentClient11.register("", "Student", "hi!");
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
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        java.lang.String str17 = studentClient11.getType();
        java.lang.Class<?> wildcardClass18 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Student" + "'", str17, "Student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient7.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("Student", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "hi!", "Student");
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        java.lang.Class<?> wildcardClass6 = studentClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
            java.lang.String str10 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
            java.lang.String str11 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        java.lang.Class<?> wildcardClass10 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        java.lang.Class<?> wildcardClass14 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
            studentClient6.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
            java.lang.String str12 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient3.getType();
        java.lang.String str6 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("Student", "", "hi!");
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        java.lang.Class<?> wildcardClass18 = studentClient17.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        java.lang.String str11 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient9.getPassword("hi!");
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
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("Student", "Student", "hi!");
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
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str7 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
            studentClient11.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient13.getPassword("Student");
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
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        java.lang.String str12 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        java.lang.Class<?> wildcardClass9 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
            java.lang.String str15 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient12.getPassword("Student");
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
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        java.lang.String str11 = studentClient9.getType();
        java.lang.String str12 = studentClient9.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient1.getType();
        java.lang.String str5 = studentClient1.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient1);
        java.lang.Class<?> wildcardClass7 = studentClient1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.Class<?> wildcardClass6 = studentClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        java.lang.Class<?> wildcardClass15 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient8.getPassword("hi!");
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
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
            java.lang.String str14 = studentClient9.getPassword("Student");
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
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient8.getPassword("");
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
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("");
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
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
            java.lang.String str10 = studentClient6.getPassword("");
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
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
            java.lang.String str19 = studentClient17.getPassword("hi!");
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
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
            studentClient13.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        java.lang.String str12 = studentClient9.getType();
        java.lang.Class<?> wildcardClass13 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        java.lang.Class<?> wildcardClass16 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("", "hi!", "hi!");
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
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
            java.lang.String str10 = studentClient6.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
            studentClient13.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        java.lang.String str14 = studentClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient17.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
            java.lang.String str12 = studentClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        java.lang.String str9 = studentClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        java.lang.Class<?> wildcardClass10 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient5.getType();
        java.lang.String str8 = studentClient5.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str8 = studentClient5.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        java.lang.String str12 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
            studentClient5.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
            studentClient6.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
            java.lang.String str18 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
            java.lang.String str14 = studentClient10.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        java.lang.String str6 = studentClient3.getType();
        java.lang.Class<?> wildcardClass7 = studentClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass8 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        java.lang.String str11 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = studentClient18.getPassword("");
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
            studentClient6.register("hi!", "hi!", "Student");
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
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
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
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
            studentClient10.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
            studentClient12.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = studentClient11.getPassword("");
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
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient3.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient3.getType();
        java.lang.Class<?> wildcardClass8 = studentClient3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient7.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
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
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
            studentClient11.register("", "Student", "");
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
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        java.lang.Class<?> wildcardClass11 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        java.lang.Class<?> wildcardClass16 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        java.lang.Class<?> wildcardClass11 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
            java.lang.String str16 = studentClient9.getPassword("hi!");
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
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient13.getPassword("");
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
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
            java.lang.String str12 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("Student", "Student", "");
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
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
            studentClient11.register("", "Student", "Student");
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
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        java.lang.Class<?> wildcardClass6 = studentClient5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
            java.lang.String str9 = studentClient3.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.lang.Class<?> wildcardClass15 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("");
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
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
            studentClient6.register("hi!", "", "Student");
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
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        java.lang.String str14 = studentClient13.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass8 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
            studentClient11.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        java.lang.Class<?> wildcardClass12 = studentClient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        java.lang.String str16 = studentClient7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
            studentClient9.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
            studentClient9.register("Student", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        java.lang.Class<?> wildcardClass10 = studentClient3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        java.lang.String str12 = studentClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        java.lang.String str13 = studentClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        java.lang.Class<?> wildcardClass12 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient2);
        java.lang.Class<?> wildcardClass9 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = studentClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        java.lang.Class<?> wildcardClass11 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient4.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient4);
        java.lang.Class<?> wildcardClass9 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        java.lang.Class<?> wildcardClass18 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass7 = studentClient6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
            java.lang.String str12 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        java.lang.String str10 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
            java.lang.String str14 = studentClient12.getPassword("hi!");
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
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("Student", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
            studentClient11.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        java.lang.Class<?> wildcardClass11 = studentClient4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
            studentClient5.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
            studentClient12.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
            java.lang.String str14 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        java.lang.Class<?> wildcardClass12 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
            studentClient7.register("Student", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
            studentClient6.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
            studentClient8.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass7 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
            studentClient14.register("", "Student", "Student");
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
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "", "");
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
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str7 = studentClient6.getType();
        java.lang.Class<?> wildcardClass8 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        java.lang.String str6 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        java.lang.Class<?> wildcardClass10 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
            studentClient12.register("hi!", "Student", "");
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
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        java.lang.String str10 = studentClient8.getType();
        java.lang.String str11 = studentClient8.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
            java.lang.String str11 = studentClient8.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.Class<?> wildcardClass5 = studentClient4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
            studentClient11.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        java.lang.Class<?> wildcardClass12 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient7.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = studentClient11.getPassword("hi!");
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
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
            studentClient2.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
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
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient11.getPassword("hi!");
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
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        java.lang.String str13 = studentClient12.getType();
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
            studentClient11.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
            studentClient8.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient13.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.Class<?> wildcardClass7 = studentClient4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        java.lang.Class<?> wildcardClass11 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
            studentClient4.register("hi!", "Student", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = studentClient2.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient14.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        java.lang.Class<?> wildcardClass10 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        java.lang.String str12 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        java.lang.Class<?> wildcardClass11 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str8 = studentClient7.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
            studentClient6.register("Student", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = studentClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
            studentClient13.register("Student", "hi!", "hi!");
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
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
            studentClient13.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
            java.lang.String str15 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient7.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
            java.lang.String str21 = studentClient19.getPassword("Student");
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
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str8 = studentClient7.getType();
        java.lang.Class<?> wildcardClass9 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        java.lang.String str15 = studentClient12.getType();
        java.lang.Class<?> wildcardClass16 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Student" + "'", str15, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        java.lang.String str12 = studentClient10.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass9 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
            java.lang.String str14 = studentClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient9.getPassword("");
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
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = studentClient4.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient10.getType();
        java.lang.String str12 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
            java.lang.String str11 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient10.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
            java.lang.String str18 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str8 = studentClient7.getType();
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient7);
        java.lang.Class<?> wildcardClass10 = studentClient7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        java.lang.String str7 = studentClient2.getType();
        java.lang.Class<?> wildcardClass8 = studentClient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient8.register("", "hi!", "hi!");
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
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient9 = new login.StudentClient((login.Client) studentClient8);
        java.lang.String str10 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
            java.lang.String str16 = studentClient13.getPassword("hi!");
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
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        java.lang.Class<?> wildcardClass14 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
            studentClient9.register("Student", "hi!", "");
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
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
            studentClient3.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        login.StudentClient studentClient11 = new login.StudentClient((login.Client) studentClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("");
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
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        login.StudentClient studentClient15 = new login.StudentClient((login.Client) studentClient14);
        // The following exception was thrown during execution in test generation
        try {
            studentClient15.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
            studentClient8.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient10.getPassword("");
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
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        java.lang.Class<?> wildcardClass10 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        java.lang.Class<?> wildcardClass12 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
            studentClient15.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        java.lang.Class<?> wildcardClass10 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
            studentClient12.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        java.lang.String str10 = studentClient6.getType();
        java.lang.String str11 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        java.lang.String str12 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        java.lang.String str12 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = studentClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        java.lang.String str8 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        java.lang.Class<?> wildcardClass16 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
            java.lang.String str19 = studentClient15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        login.StudentClient studentClient10 = new login.StudentClient((login.Client) studentClient9);
        java.lang.String str11 = studentClient10.getType();
        java.lang.String str12 = studentClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass9 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
            studentClient4.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str6 = studentClient5.getType();
        java.lang.Class<?> wildcardClass7 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
            studentClient7.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = studentClient13.getPassword("hi!");
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
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        java.lang.Class<?> wildcardClass11 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
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
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str8 = studentClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient8.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
            java.lang.String str13 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = studentClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        java.lang.String str12 = studentClient11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        java.lang.String str11 = studentClient9.getType();
        java.lang.Class<?> wildcardClass12 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str8 = studentClient5.getType();
        java.lang.Class<?> wildcardClass9 = studentClient5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        java.lang.Class<?> wildcardClass11 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
            studentClient13.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        java.lang.Class<?> wildcardClass13 = studentClient4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        java.lang.Class<?> wildcardClass15 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
            studentClient8.register("Student", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.Class<?> wildcardClass7 = studentClient4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        java.lang.Class<?> wildcardClass11 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        java.lang.String str10 = studentClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient6);
        java.lang.Class<?> wildcardClass9 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        java.lang.Class<?> wildcardClass21 = studentClient19.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Student" + "'", str20, "Student");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
            java.lang.String str11 = studentClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
            java.lang.String str16 = studentClient9.getPassword("hi!");
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
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
            java.lang.String str9 = studentClient6.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "hi!", "");
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
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient13.register("", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "Student", "");
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
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("");
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
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        login.StudentClient studentClient13 = new login.StudentClient((login.Client) studentClient12);
        java.lang.Class<?> wildcardClass14 = studentClient13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient10.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        java.lang.String str13 = studentClient12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
            studentClient8.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        java.lang.Class<?> wildcardClass18 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient4.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
            java.lang.String str12 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
            java.lang.String str14 = studentClient10.getPassword("");
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
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        java.lang.Class<?> wildcardClass13 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        java.lang.Class<?> wildcardClass12 = studentClient11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient17.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
            studentClient4.register("Student", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
        java.lang.Class<?> wildcardClass15 = studentClient14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
            studentClient10.register("Student", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
            java.lang.String str11 = studentClient7.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        java.lang.String str12 = studentClient9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
            studentClient12.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient9.getPassword("Student");
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
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("Student", "", "hi!");
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
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient12.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
            studentClient7.register("", "hi!", "hi!");
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
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient5);
        java.lang.Class<?> wildcardClass9 = studentClient5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
            studentClient8.register("", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
            java.lang.String str15 = studentClient11.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        java.lang.Class<?> wildcardClass10 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        java.lang.Class<?> wildcardClass12 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient5.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
            java.lang.String str12 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        java.lang.Class<?> wildcardClass11 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        java.lang.Class<?> wildcardClass16 = studentClient15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        java.lang.String str9 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
            studentClient12.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
            java.lang.String str12 = studentClient10.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str6 = studentClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient5.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        login.StudentClient studentClient12 = new login.StudentClient((login.Client) studentClient11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient12.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient2.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = studentClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = studentClient4.getPassword("");
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
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        java.lang.String str7 = studentClient6.getType();
        java.lang.String str8 = studentClient6.getType();
        java.lang.String str9 = studentClient6.getType();
        java.lang.String str10 = studentClient6.getType();
        java.lang.String str11 = studentClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("Student", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient12.register("Student", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
            studentClient10.register("Student", "hi!", "");
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
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient6);
        login.StudentClient studentClient8 = new login.StudentClient((login.Client) studentClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = studentClient7.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
            studentClient10.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
            java.lang.String str10 = studentClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        java.lang.Class<?> wildcardClass11 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("", "", "");
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
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
            java.lang.String str14 = studentClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient2.getType();
        java.lang.String str6 = studentClient2.getType();
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient5);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = studentClient5.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("hi!", "Student", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str3 = studentClient2.getType();
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        java.lang.String str5 = studentClient4.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient4);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        java.lang.Class<?> wildcardClass10 = studentClient8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
            studentClient5.register("", "", "Student");
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
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
            studentClient10.register("hi!", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = studentClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Student" + "'", str14, "Student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Student" + "'", str16, "Student");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        java.lang.Class<?> wildcardClass10 = studentClient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        java.lang.String str13 = studentClient12.getType();
        java.lang.Class<?> wildcardClass14 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("Student", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
            studentClient9.register("Student", "hi!", "Student");
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
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
            java.lang.String str13 = studentClient11.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        java.lang.String str12 = studentClient9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Student" + "'", str12, "Student");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        java.lang.String str3 = studentClient2.getType();
        java.lang.String str4 = studentClient2.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient18.register("hi!", "", "Student");
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
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
            studentClient8.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = studentClient12.getPassword("Student");
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
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        java.lang.Class<?> wildcardClass7 = studentClient6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
            java.lang.String str13 = studentClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
            java.lang.String str11 = studentClient9.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        login.StudentClient studentClient16 = new login.StudentClient((login.Client) studentClient12);
        // The following exception was thrown during execution in test generation
        try {
            studentClient16.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        java.lang.String str13 = studentClient12.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("Student", "", "hi!");
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
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
            studentClient14.register("hi!", "Student", "hi!");
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
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
            studentClient8.register("", "Student", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        java.lang.Class<?> wildcardClass15 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Student" + "'", str13, "Student");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
            java.lang.String str11 = studentClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient9.register("hi!", "", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient11.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
            java.lang.String str14 = studentClient12.getPassword("hi!");
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
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = studentClient8.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Student" + "'", str7, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient(client0);
        java.lang.String str4 = studentClient3.getType();
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            studentClient3.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        java.lang.Class<?> wildcardClass13 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient3.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient6.register("Student", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        java.lang.String str5 = studentClient3.getType();
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = studentClient3.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = studentClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient1);
        java.lang.String str4 = studentClient3.getType();
        java.lang.String str5 = studentClient3.getType();
        java.lang.Class<?> wildcardClass6 = studentClient3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Student" + "'", str4, "Student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        java.lang.Class<?> wildcardClass12 = studentClient10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
            studentClient9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
            studentClient4.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient((login.Client) studentClient1);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient2);
        // The following exception was thrown during execution in test generation
        try {
            studentClient4.register("hi!", "hi!", "Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        java.lang.Class<?> wildcardClass13 = studentClient12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        java.lang.Class<?> wildcardClass11 = studentClient9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Student" + "'", str3, "Student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Student" + "'", str6, "Student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Student" + "'", str10, "Student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = studentClient10.getPassword("Student");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Student" + "'", str5, "Student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Student" + "'", str8, "Student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Student" + "'", str9, "Student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Student" + "'", str11, "Student");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
        // The following exception was thrown during execution in test generation
        try {
            studentClient17.register("hi!", "", "Student");
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
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        login.Client client0 = null;
        login.StudentClient studentClient1 = new login.StudentClient(client0);
        login.StudentClient studentClient2 = new login.StudentClient(client0);
        login.StudentClient studentClient3 = new login.StudentClient((login.Client) studentClient2);
        login.StudentClient studentClient4 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient5 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient6 = new login.StudentClient((login.Client) studentClient3);
        login.StudentClient studentClient7 = new login.StudentClient((login.Client) studentClient3);
        java.lang.Class<?> wildcardClass8 = studentClient3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

