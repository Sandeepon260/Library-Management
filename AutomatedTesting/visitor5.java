	package AutomatedTesting;
	
	import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class visitor5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor9);
        java.lang.String str16 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            visitor3.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        java.lang.Class<?> wildcardClass9 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor2.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("visitor", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor3.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.String str13 = visitor12.getType();
        java.lang.String str14 = visitor12.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        java.lang.String str13 = visitor12.getType();
        java.lang.String str14 = visitor12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor9.getType();
        java.lang.Class<?> wildcardClass11 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.String str14 = visitor13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass11 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        java.lang.String str12 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("hi!", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass14 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        java.lang.String str8 = visitor4.getType();
        java.lang.String str9 = visitor4.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        java.lang.String str11 = visitor10.getType();
        java.lang.String str12 = visitor10.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        // The following exception was thrown during execution in test generation
        try {
            visitor1.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor2.getType();
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        java.lang.String str6 = visitor4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = visitor4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.String str13 = visitor12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass9 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor7.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = visitor7.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        java.lang.String str7 = visitor3.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor8.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        java.lang.String str16 = visitor15.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor15);
        java.lang.String str18 = visitor17.getType();
        login.Visitor visitor19 = new login.Visitor((login.Client) visitor17);
        login.Visitor visitor20 = new login.Visitor((login.Client) visitor17);
        java.lang.Class<?> wildcardClass21 = visitor20.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        java.lang.String str14 = visitor10.getType();
        java.lang.String str15 = visitor10.getType();
        java.lang.String str16 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = visitor10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass11 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        java.lang.String str9 = visitor6.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        java.lang.String str14 = visitor10.getType();
        java.lang.String str15 = visitor10.getType();
        java.lang.String str16 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor15.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        java.lang.String str12 = visitor8.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.Class<?> wildcardClass14 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.String str13 = visitor12.getType();
        java.lang.String str14 = visitor12.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass14 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor7.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = visitor17.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        java.lang.String str11 = visitor4.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        java.lang.String str12 = visitor10.getType();
        java.lang.String str13 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        java.lang.String str12 = visitor5.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.Class<?> wildcardClass14 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        java.lang.String str13 = visitor12.getType();
        java.lang.String str14 = visitor12.getType();
        java.lang.String str15 = visitor12.getType();
        java.lang.String str16 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("hi!", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.Class<?> wildcardClass14 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        java.lang.String str12 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor2.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass14 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        java.lang.String str12 = visitor8.getType();
        java.lang.String str13 = visitor8.getType();
        java.lang.String str14 = visitor8.getType();
        java.lang.Class<?> wildcardClass15 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        java.lang.String str12 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        java.lang.String str8 = visitor4.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        java.lang.String str11 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        java.lang.String str13 = visitor12.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        java.lang.String str13 = visitor12.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        java.lang.String str11 = visitor4.getType();
        java.lang.String str12 = visitor4.getType();
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        java.lang.String str12 = visitor11.getType();
        java.lang.String str13 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        java.lang.String str7 = visitor3.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        java.lang.Class<?> wildcardClass9 = visitor3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        java.lang.Class<?> wildcardClass8 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("visitor", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        java.lang.String str12 = visitor8.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass14 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        java.lang.String str8 = visitor4.getType();
        java.lang.String str9 = visitor4.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        java.lang.String str11 = visitor4.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("visitor", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("visitor", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        java.lang.String str11 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.Class<?> wildcardClass6 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.Class<?> wildcardClass7 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.String str13 = visitor10.getType();
        java.lang.String str14 = visitor10.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor15.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor9);
        java.lang.String str14 = visitor13.getType();
        java.lang.Class<?> wildcardClass15 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor16);
        // The following exception was thrown during execution in test generation
        try {
            visitor17.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor12.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("visitor", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor6.getType();
        java.lang.String str10 = visitor6.getType();
        java.lang.Class<?> wildcardClass11 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.String str14 = visitor13.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        java.lang.String str16 = visitor13.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        java.lang.String str5 = visitor3.getType();
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            visitor3.register("visitor", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor13.getType();
        java.lang.String str15 = visitor13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor3.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.Class<?> wildcardClass6 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.String str13 = visitor12.getType();
        java.lang.String str14 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor11.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        java.lang.String str16 = visitor11.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor19 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor19.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor6.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        java.lang.String str7 = visitor3.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor11.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        java.lang.String str11 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = visitor15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        java.lang.String str12 = visitor7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        java.lang.String str10 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        java.lang.String str12 = visitor8.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        java.lang.String str14 = visitor8.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor3.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor9.getType();
        java.lang.Class<?> wildcardClass12 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        java.lang.String str11 = visitor7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = visitor2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.Class<?> wildcardClass15 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("hi!", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor12.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        java.lang.String str16 = visitor11.getType();
        java.lang.String str17 = visitor11.getType();
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor19 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass20 = visitor19.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        java.lang.String str13 = visitor7.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.String str13 = visitor10.getType();
        java.lang.String str14 = visitor10.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor2.getType();
        java.lang.String str9 = visitor2.getType();
        java.lang.String str10 = visitor2.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor2);
        java.lang.String str13 = visitor12.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor14.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor3.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor4.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.Class<?> wildcardClass15 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        java.lang.String str12 = visitor5.getType();
        java.lang.String str13 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass13 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        java.lang.String str7 = visitor3.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass11 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = visitor7.getType();
        java.lang.Class<?> wildcardClass10 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        java.lang.String str9 = visitor6.getType();
        java.lang.Class<?> wildcardClass10 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        java.lang.String str9 = visitor6.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor7.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        java.lang.String str8 = visitor2.getType();
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        java.lang.Class<?> wildcardClass11 = visitor2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        java.lang.String str16 = visitor15.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor15);
        java.lang.String str18 = visitor17.getType();
        login.Visitor visitor19 = new login.Visitor((login.Client) visitor17);
        login.Visitor visitor20 = new login.Visitor((login.Client) visitor19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = visitor19.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        java.lang.String str8 = visitor5.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor10.getType();
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        java.lang.Class<?> wildcardClass16 = visitor15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        java.lang.String str13 = visitor12.getType();
        java.lang.Class<?> wildcardClass14 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.String str13 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass13 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor15);
        java.lang.Class<?> wildcardClass18 = visitor17.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("visitor", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass10 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor2.getType();
        java.lang.String str9 = visitor2.getType();
        java.lang.String str10 = visitor2.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("visitor", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        java.lang.String str16 = visitor11.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor11);
        java.lang.String str18 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        java.lang.String str13 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.Class<?> wildcardClass14 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass11 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor11.getType();
        java.lang.Class<?> wildcardClass13 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        java.lang.String str7 = visitor3.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.String str15 = visitor13.getType();
        java.lang.Class<?> wildcardClass16 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.Class<?> wildcardClass6 = visitor5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor8.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        java.lang.String str15 = visitor14.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor14.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor13.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        java.lang.Class<?> wildcardClass16 = visitor15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.String str9 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        java.lang.String str16 = visitor11.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = visitor11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor9);
        java.lang.String str14 = visitor9.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor15.register("hi!", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = visitor3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor3.getType();
        java.lang.String str9 = visitor3.getType();
        java.lang.String str10 = visitor3.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.String str14 = visitor13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor13.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor13.getType();
        java.lang.Class<?> wildcardClass15 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.String str13 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor5.getType();
        java.lang.Class<?> wildcardClass9 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor2.getType();
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor2);
        java.lang.String str12 = visitor2.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor8.getType();
        java.lang.Class<?> wildcardClass13 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        java.lang.String str13 = visitor7.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("visitor", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass13 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        java.lang.String str13 = visitor7.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor7.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass12 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass13 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor2.getType();
        java.lang.String str9 = visitor2.getType();
        java.lang.String str10 = visitor2.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor2);
        java.lang.String str13 = visitor12.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("visitor", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        java.lang.String str16 = visitor15.getType();
        java.lang.String str17 = visitor15.getType();
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor15);
        java.lang.Class<?> wildcardClass19 = visitor15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        java.lang.String str7 = visitor3.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor8.getType();
        java.lang.Class<?> wildcardClass11 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        java.lang.String str8 = visitor4.getType();
        java.lang.String str9 = visitor4.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor4);
        java.lang.String str12 = visitor4.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        java.lang.String str12 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor4.getType();
        java.lang.String str10 = visitor4.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        java.lang.String str2 = visitor1.getType();
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor3.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "visitor" + "'", str2, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        java.lang.String str12 = visitor5.getType();
        java.lang.String str13 = visitor5.getType();
        java.lang.Class<?> wildcardClass14 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass14 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor2);
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.String str14 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.String str14 = visitor13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor13.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor4);
        java.lang.String str12 = visitor4.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        java.lang.String str8 = visitor2.getType();
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        java.lang.String str11 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor15);
        // The following exception was thrown during execution in test generation
        try {
            visitor17.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.Class<?> wildcardClass9 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor6.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor6.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor5);
        java.lang.String str13 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor5.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        java.lang.Class<?> wildcardClass9 = visitor3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        java.lang.String str10 = visitor7.getType();
        java.lang.String str11 = visitor7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        java.lang.String str13 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor4.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        java.lang.String str11 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        java.lang.String str5 = visitor3.getType();
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        java.lang.String str16 = visitor11.getType();
        java.lang.String str17 = visitor11.getType();
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor19 = new login.Visitor((login.Client) visitor11);
        java.lang.String str20 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "visitor" + "'", str20, "visitor");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor13.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        java.lang.String str17 = visitor16.getType();
        java.lang.String str18 = visitor16.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        java.lang.String str11 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        java.lang.String str8 = visitor2.getType();
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor12.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.Class<?> wildcardClass15 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.String str15 = visitor13.getType();
        java.lang.String str16 = visitor13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = visitor13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        java.lang.String str13 = visitor12.getType();
        java.lang.String str14 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        java.lang.String str8 = visitor4.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = visitor3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        java.lang.String str8 = visitor4.getType();
        java.lang.String str9 = visitor4.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            visitor16.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor7.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass14 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        java.lang.String str7 = visitor3.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("visitor", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        java.lang.Class<?> wildcardClass17 = visitor15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = visitor3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        java.lang.String str12 = visitor8.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        java.lang.String str13 = visitor12.getType();
        java.lang.String str14 = visitor12.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor15.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.String str9 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.Class<?> wildcardClass6 = visitor5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        java.lang.String str13 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = visitor2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor12.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass13 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass13 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor10.getType();
        java.lang.String str12 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.Class<?> wildcardClass9 = visitor2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        java.lang.String str12 = visitor8.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.Class<?> wildcardClass15 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = visitor2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass11 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor10.getType();
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        java.lang.Class<?> wildcardClass12 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor14.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.Class<?> wildcardClass8 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        java.lang.String str14 = visitor10.getType();
        java.lang.String str15 = visitor10.getType();
        java.lang.String str16 = visitor10.getType();
        java.lang.Class<?> wildcardClass17 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor5.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        java.lang.String str13 = visitor11.getType();
        java.lang.Class<?> wildcardClass14 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("visitor", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        java.lang.String str13 = visitor7.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        // The following exception was thrown during execution in test generation
        try {
            visitor15.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("hi!", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor4.getType();
        java.lang.String str10 = visitor4.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("visitor", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor10.getType();
        java.lang.String str12 = visitor10.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass15 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        java.lang.Class<?> wildcardClass13 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        java.lang.String str11 = visitor5.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        java.lang.String str13 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.Class<?> wildcardClass15 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor16);
        // The following exception was thrown during execution in test generation
        try {
            visitor16.register("visitor", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("visitor", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass11 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        java.lang.String str16 = visitor15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        java.lang.String str16 = visitor11.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor11);
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = visitor18.getType();
        java.lang.Class<?> wildcardClass21 = visitor18.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "visitor" + "'", str19, "visitor");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "visitor" + "'", str20, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor6.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor12.getType();
        java.lang.String str15 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor14);
        java.lang.Class<?> wildcardClass17 = visitor16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.Class<?> wildcardClass14 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor2);
        java.lang.Class<?> wildcardClass12 = visitor2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor2.getType();
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.String str13 = visitor10.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor14.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass13 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor3.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        java.lang.Class<?> wildcardClass7 = visitor3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass14 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        java.lang.String str2 = visitor1.getType();
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.Class<?> wildcardClass5 = visitor3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "visitor" + "'", str2, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass11 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        java.lang.String str10 = visitor4.getType();
        java.lang.Class<?> wildcardClass11 = visitor4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        java.lang.String str15 = visitor11.getType();
        java.lang.String str16 = visitor11.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = visitor18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass14 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        java.lang.String str13 = visitor9.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.Class<?> wildcardClass11 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        java.lang.String str12 = visitor7.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        java.lang.String str7 = visitor3.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        java.lang.String str11 = visitor10.getType();
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor5.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        java.lang.Class<?> wildcardClass12 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.String str14 = visitor11.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor11);
        java.lang.String str16 = visitor11.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = visitor18.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor13.getType();
        java.lang.Class<?> wildcardClass15 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.Class<?> wildcardClass14 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor12.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass13 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.Class<?> wildcardClass5 = visitor4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass10 = visitor8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        java.lang.String str5 = visitor3.getType();
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor8.getType();
        java.lang.Class<?> wildcardClass10 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.Class<?> wildcardClass8 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor11.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor3.register("hi!", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.Class<?> wildcardClass9 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        login.Visitor visitor4 = new login.Visitor(client0);
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        java.lang.String str10 = visitor4.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass14 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("visitor", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass14 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        java.lang.String str10 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.Class<?> wildcardClass15 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor9);
        java.lang.String str15 = visitor9.getType();
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("visitor", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor3.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor9.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor13.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor14.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        java.lang.String str8 = visitor2.getType();
        java.lang.String str9 = visitor2.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        java.lang.String str12 = visitor9.getType();
        java.lang.String str13 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor9.getType();
        java.lang.String str12 = visitor9.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.String str13 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor8.getType();
        java.lang.Class<?> wildcardClass11 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        java.lang.String str7 = visitor3.getType();
        java.lang.String str8 = visitor3.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor3.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor8.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass13 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        java.lang.String str8 = visitor4.getType();
        java.lang.String str9 = visitor4.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        java.lang.String str11 = visitor4.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.String str14 = visitor13.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        java.lang.Class<?> wildcardClass17 = visitor16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        java.lang.String str7 = visitor4.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.String str13 = visitor10.getType();
        java.lang.Class<?> wildcardClass14 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor4.getType();
        java.lang.String str10 = visitor4.getType();
        java.lang.String str11 = visitor4.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        java.lang.String str11 = visitor8.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass11 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        java.lang.String str9 = visitor6.getType();
        java.lang.String str10 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("visitor", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        java.lang.String str16 = visitor15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor6.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        java.lang.Class<?> wildcardClass8 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor10.getType();
        java.lang.String str12 = visitor10.getType();
        java.lang.String str13 = visitor10.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass15 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        java.lang.String str8 = visitor4.getType();
        java.lang.String str9 = visitor4.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        java.lang.String str11 = visitor4.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        java.lang.String str8 = visitor4.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor4);
        java.lang.String str10 = visitor4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor4);
        java.lang.String str9 = visitor4.getType();
        java.lang.String str10 = visitor4.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("hi!", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        java.lang.String str11 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.String str9 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        java.lang.String str11 = visitor10.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor13.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        // The following exception was thrown during execution in test generation
        try {
            visitor15.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor2.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass13 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.Class<?> wildcardClass6 = visitor5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.String str14 = visitor13.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        java.lang.String str16 = visitor13.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = visitor17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.String str15 = visitor14.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        java.lang.Class<?> wildcardClass11 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor2.getType();
        java.lang.String str9 = visitor2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor4);
        java.lang.String str8 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.String str15 = visitor13.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }
}

