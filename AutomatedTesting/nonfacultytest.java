package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class nonfacultytest {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str0 = login.Client.type;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient1.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = nonFacultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        java.lang.Class<?> wildcardClass2 = nonFacultyClient1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient1.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.Class<?> wildcardClass3 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = nonFacultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass5 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.Class<?> wildcardClass4 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.Class<?> wildcardClass4 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass4 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient1.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass4 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient1.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.Class<?> wildcardClass3 = nonFacultyClient1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.Class<?> wildcardClass5 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str8 = nonFacultyClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.Class<?> wildcardClass4 = nonFacultyClient1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient2.getType();
        java.lang.Class<?> wildcardClass9 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        java.lang.Class<?> wildcardClass5 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.Class<?> wildcardClass6 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str8 = nonFacultyClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient7.getType();
        java.lang.Class<?> wildcardClass9 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.Class<?> wildcardClass5 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass6 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass5 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.Class<?> wildcardClass6 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.Class<?> wildcardClass7 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient1.getType();
        java.lang.Class<?> wildcardClass4 = nonFacultyClient1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass6 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass4 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass5 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        java.lang.Class<?> wildcardClass7 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass6 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.Class<?> wildcardClass5 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.Class<?> wildcardClass6 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        java.lang.Class<?> wildcardClass8 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.Class<?> wildcardClass3 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass10 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient3.getType();
        java.lang.Class<?> wildcardClass7 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        java.lang.Class<?> wildcardClass11 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        java.lang.Class<?> wildcardClass5 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.Class<?> wildcardClass8 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        java.lang.Class<?> wildcardClass11 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass6 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.Class<?> wildcardClass8 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass6 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        java.lang.Class<?> wildcardClass6 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass6 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "hi!", "hi!");
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.lang.Class<?> wildcardClass11 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient4.getType();
        java.lang.Class<?> wildcardClass8 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        java.lang.Class<?> wildcardClass6 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.Class<?> wildcardClass8 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.Class<?> wildcardClass4 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
            java.lang.String str13 = nonFacultyClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient3.getType();
        java.lang.Class<?> wildcardClass6 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        java.lang.Class<?> wildcardClass13 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass10 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.Class<?> wildcardClass9 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        java.lang.String str12 = nonFacultyClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass6 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = nonFacultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str8 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
            java.lang.String str13 = nonFacultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        java.lang.Class<?> wildcardClass11 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.Class<?> wildcardClass4 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        java.lang.Class<?> wildcardClass13 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
            nonFacultyClient7.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.String str9 = nonFacultyClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        java.lang.Class<?> wildcardClass11 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
            nonFacultyClient6.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
            java.lang.String str13 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.lang.String str11 = nonFacultyClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient1.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        java.lang.Class<?> wildcardClass9 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = nonFacultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass5 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
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
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient4.getType();
        java.lang.String str8 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient7.getPassword("");
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "hi!", "hi!");
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        java.lang.Class<?> wildcardClass8 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.String str8 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "hi!", "");
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
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str7 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        java.lang.Class<?> wildcardClass13 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = nonFacultyClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.Class<?> wildcardClass6 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass4 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str8 = nonFacultyClient7.getType();
        java.lang.Class<?> wildcardClass9 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        java.lang.Class<?> wildcardClass12 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        java.lang.Class<?> wildcardClass13 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str8 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient3.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        java.lang.Class<?> wildcardClass9 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = nonFacultyClient11.getPassword("");
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient3.getType();
        java.lang.Class<?> wildcardClass7 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = nonFacultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient13.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
            java.lang.String str9 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        java.lang.Class<?> wildcardClass16 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient4.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass7 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str8 = nonFacultyClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
            nonFacultyClient7.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.lang.Class<?> wildcardClass13 = nonFacultyClient12.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "");
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
            nonFacultyClient6.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient9 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient5.getType();
        java.lang.Class<?> wildcardClass7 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        java.lang.String str11 = nonFacultyClient5.getType();
        java.lang.Class<?> wildcardClass12 = nonFacultyClient5.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient2.getType();
        java.lang.Class<?> wildcardClass7 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
            java.lang.String str9 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient1.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient(client0);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass6 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        java.lang.String str14 = nonFacultyClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = nonFacultyClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        java.lang.Class<?> wildcardClass12 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str8 = nonFacultyClient7.getType();
        java.lang.String str9 = nonFacultyClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        java.lang.Class<?> wildcardClass8 = nonFacultyClient6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        java.lang.String str7 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str7 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.lang.Class<?> wildcardClass16 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        java.lang.String str8 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass6 = nonFacultyClient2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
            java.lang.String str9 = nonFacultyClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        java.lang.String str7 = nonFacultyClient5.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient10.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        java.lang.String str11 = nonFacultyClient10.getType();
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient12.getPassword("");
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str8 = nonFacultyClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str7 = nonFacultyClient6.getType();
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient3.getType();
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
            java.lang.String str9 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        java.lang.Class<?> wildcardClass11 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = nonFacultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        java.lang.Class<?> wildcardClass11 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "hi!", "");
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
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
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
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient5);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = nonFacultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str7 = nonFacultyClient6.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient6.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient2.getType();
        java.lang.String str7 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = nonFacultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = nonFacultyClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient4);
        java.lang.String str6 = nonFacultyClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient5.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
            java.lang.String str10 = nonFacultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient9.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        login.nonFacultyClient nonFacultyClient11 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.Class<?> wildcardClass12 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        java.lang.Class<?> wildcardClass11 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient11.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str5 = nonFacultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nonFacultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = nonFacultyClient8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
            nonFacultyClient7.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = nonFacultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        login.nonFacultyClient nonFacultyClient12 = new login.nonFacultyClient((login.Client) nonFacultyClient10);
        java.lang.Class<?> wildcardClass13 = nonFacultyClient10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = nonFacultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.String str10 = nonFacultyClient8.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient8.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        java.lang.String str4 = nonFacultyClient2.getType();
        java.lang.String str5 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient6 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient8 = new login.nonFacultyClient((login.Client) nonFacultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient7.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient2.getType();
        java.lang.String str6 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient7 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass8 = nonFacultyClient7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str6 = nonFacultyClient2.getType();
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.Class<?> wildcardClass5 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        java.lang.Class<?> wildcardClass10 = nonFacultyClient9.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient(client0);
        java.lang.String str3 = nonFacultyClient2.getType();
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        java.lang.String str5 = nonFacultyClient4.getType();
        java.lang.Class<?> wildcardClass6 = nonFacultyClient4.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        java.lang.Class<?> wildcardClass12 = nonFacultyClient11.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient12.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
            nonFacultyClient12.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        // The following exception was thrown during execution in test generation
        try {
            nonFacultyClient2.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        login.nonFacultyClient nonFacultyClient5 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.String str6 = nonFacultyClient5.getType();
        java.lang.String str7 = nonFacultyClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = nonFacultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        login.Client client0 = null;
        login.nonFacultyClient nonFacultyClient1 = new login.nonFacultyClient(client0);
        login.nonFacultyClient nonFacultyClient2 = new login.nonFacultyClient((login.Client) nonFacultyClient1);
        login.nonFacultyClient nonFacultyClient3 = new login.nonFacultyClient((login.Client) nonFacultyClient2);
        login.nonFacultyClient nonFacultyClient4 = new login.nonFacultyClient((login.Client) nonFacultyClient3);
        java.lang.Class<?> wildcardClass5 = nonFacultyClient3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }
}

