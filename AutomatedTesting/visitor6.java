	package AutomatedTesting;
	
	import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class visitor6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        java.lang.String str12 = visitor9.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        java.lang.String str17 = visitor15.getType();
        java.lang.Class<?> wildcardClass18 = visitor15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        java.lang.Class<?> wildcardClass15 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        java.lang.String str13 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor12.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor14.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor6.getType();
        java.lang.String str10 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
            java.lang.String str15 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "", "visitor");
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
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor18.register("", "", "");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        java.lang.Class<?> wildcardClass13 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor8.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        java.lang.Class<?> wildcardClass13 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass10 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        java.lang.String str8 = visitor4.getType();
        java.lang.String str9 = visitor4.getType();
        java.lang.String str10 = visitor4.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor8);
        java.lang.String str17 = visitor16.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("visitor", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "visitor", "");
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("");
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
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        java.lang.String str14 = visitor13.getType();
        java.lang.Class<?> wildcardClass15 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor5.getType();
        java.lang.String str9 = visitor5.getType();
        java.lang.String str10 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        java.lang.String str7 = visitor3.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        java.lang.String str11 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor16);
        java.lang.Class<?> wildcardClass18 = visitor16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor14);
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor14);
        java.lang.Class<?> wildcardClass18 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("hi!", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor14);
        // The following exception was thrown during execution in test generation
        try {
            visitor16.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        java.lang.String str13 = visitor11.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor14.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
            java.lang.String str11 = visitor6.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("visitor", "hi!", "");
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
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        java.lang.String str12 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = visitor15.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        java.lang.String str12 = visitor10.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass14 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
            visitor11.register("hi!", "visitor", "visitor");
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
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        java.lang.String str13 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        java.lang.String str15 = visitor12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        java.lang.Class<?> wildcardClass10 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        java.lang.Class<?> wildcardClass12 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        java.lang.String str11 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        java.lang.Class<?> wildcardClass15 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        java.lang.Class<?> wildcardClass16 = visitor15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        java.lang.Class<?> wildcardClass15 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        java.lang.Class<?> wildcardClass12 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
            visitor14.register("", "visitor", "hi!");
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
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        java.lang.String str12 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        java.lang.String str13 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        java.lang.String str11 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
            visitor10.register("visitor", "hi!", "visitor");
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
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor1.getType();
        java.lang.String str5 = visitor1.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        // The following exception was thrown during execution in test generation
        try {
            visitor16.register("visitor", "", "visitor");
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
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        java.lang.String str11 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = visitor4.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor5.getType();
        java.lang.String str9 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        java.lang.String str5 = visitor3.getType();
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        java.lang.String str16 = visitor15.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        java.lang.String str20 = visitor19.getType();
        login.Visitor visitor21 = new login.Visitor((login.Client) visitor19);
        // The following exception was thrown during execution in test generation
        try {
            visitor21.register("visitor", "hi!", "visitor");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "visitor" + "'", str20, "visitor");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        java.lang.String str17 = visitor13.getType();
        java.lang.Class<?> wildcardClass18 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
            visitor12.register("visitor", "hi!", "visitor");
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
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor7.getPassword("");
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
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
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
        java.lang.Class<?> wildcardClass13 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.Class<?> wildcardClass7 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
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
        java.lang.String str12 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor11.getPassword("");
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
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor16);
        // The following exception was thrown during execution in test generation
        try {
            visitor18.register("", "visitor", "hi!");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor12);
        java.lang.String str17 = visitor16.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
            visitor12.register("visitor", "hi!", "");
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
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
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
            java.lang.String str11 = visitor8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
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
            visitor11.register("hi!", "visitor", "visitor");
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
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        java.lang.String str17 = visitor16.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        java.lang.Class<?> wildcardClass15 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        java.lang.String str7 = visitor3.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        java.lang.String str13 = visitor4.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor4);
        java.lang.Class<?> wildcardClass15 = visitor4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        java.lang.String str6 = visitor4.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.Class<?> wildcardClass8 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        java.lang.String str12 = visitor4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        java.lang.String str16 = visitor14.getType();
        java.lang.Class<?> wildcardClass17 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        java.lang.String str11 = visitor6.getType();
        java.lang.Class<?> wildcardClass12 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        java.lang.String str7 = visitor3.getType();
        java.lang.Class<?> wildcardClass8 = visitor3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.String str14 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
            java.lang.String str14 = visitor12.getPassword("hi!");
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
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
            java.lang.String str13 = visitor10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor5.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor2.getType();
        java.lang.Class<?> wildcardClass10 = visitor2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.String str11 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("hi!", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        java.lang.Class<?> wildcardClass13 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor5.getType();
        java.lang.Class<?> wildcardClass7 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        java.lang.Class<?> wildcardClass10 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
            visitor8.register("visitor", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor6.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        java.lang.String str11 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
            visitor7.register("", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        java.lang.String str2 = visitor1.getType();
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.Class<?> wildcardClass6 = visitor3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "visitor" + "'", str2, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        java.lang.String str11 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        java.lang.String str13 = visitor4.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
            java.lang.String str15 = visitor4.getPassword("visitor");
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
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        java.lang.String str13 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        java.lang.String str13 = visitor12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
            visitor7.register("", "visitor", "hi!");
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
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        java.lang.String str13 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor2.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        java.lang.String str9 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.String str9 = visitor5.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor7.getPassword("visitor");
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
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
            visitor12.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        java.lang.Class<?> wildcardClass15 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        java.lang.Class<?> wildcardClass7 = visitor6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        java.lang.Class<?> wildcardClass14 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        java.lang.String str16 = visitor14.getType();
        java.lang.Class<?> wildcardClass17 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "", "");
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
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        java.lang.String str9 = visitor6.getType();
        java.lang.String str10 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        java.lang.String str13 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
            visitor14.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
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
            java.lang.String str17 = visitor15.getPassword("");
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
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        java.lang.String str13 = visitor12.getType();
        java.lang.String str14 = visitor12.getType();
        java.lang.Class<?> wildcardClass15 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        java.lang.String str10 = visitor2.getType();
        java.lang.String str11 = visitor2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor2.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor10.getPassword("hi!");
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
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
            visitor9.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        java.lang.Class<?> wildcardClass11 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor5.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        java.lang.String str11 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
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
        java.lang.String str16 = visitor15.getType();
        java.lang.String str17 = visitor15.getType();
        java.lang.Class<?> wildcardClass18 = visitor15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        java.lang.String str10 = visitor2.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
        java.lang.Class<?> wildcardClass13 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass17 = visitor16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor8);
        java.lang.String str14 = visitor13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
            visitor7.register("", "hi!", "");
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
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        java.lang.String str17 = visitor16.getType();
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor16);
        login.Visitor visitor19 = new login.Visitor((login.Client) visitor16);
        // The following exception was thrown during execution in test generation
        try {
            visitor16.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor1.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor1.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
            java.lang.String str11 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = visitor3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass12 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
            visitor3.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        java.lang.Class<?> wildcardClass11 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor8.getType();
        java.lang.Class<?> wildcardClass13 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        java.lang.String str14 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor12.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
            visitor7.register("", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        java.lang.String str11 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        java.lang.String str14 = visitor13.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("visitor", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        java.lang.String str14 = visitor13.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor5.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        java.lang.String str14 = visitor13.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("hi!", "", "visitor");
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
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        java.lang.String str12 = visitor7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("hi!", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        java.lang.String str20 = visitor19.getType();
        login.Visitor visitor21 = new login.Visitor((login.Client) visitor19);
        java.lang.Class<?> wildcardClass22 = visitor21.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "visitor" + "'", str20, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor4);
        java.lang.Class<?> wildcardClass14 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
        java.lang.Class<?> wildcardClass18 = visitor15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        java.lang.String str9 = visitor6.getType();
        java.lang.String str10 = visitor6.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
            visitor6.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = visitor4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
            visitor2.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        java.lang.Class<?> wildcardClass14 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        java.lang.String str12 = visitor10.getType();
        java.lang.Class<?> wildcardClass13 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
            visitor12.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("visitor", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("hi!", "", "visitor");
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
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
            visitor10.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("hi!", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        java.lang.String str12 = visitor10.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass14 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
            java.lang.String str14 = visitor11.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        java.lang.String str13 = visitor11.getType();
        java.lang.Class<?> wildcardClass14 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.Class<?> wildcardClass10 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
            visitor13.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        java.lang.String str12 = visitor5.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        java.lang.Class<?> wildcardClass8 = visitor2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        java.lang.String str12 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
            java.lang.String str11 = visitor9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        java.lang.String str16 = visitor14.getType();
        java.lang.String str17 = visitor14.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        java.lang.String str13 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor11.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
            java.lang.String str12 = visitor7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass15 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        java.lang.String str11 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
            visitor9.register("visitor", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        java.lang.String str19 = visitor11.getType();
        java.lang.Class<?> wildcardClass20 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "visitor" + "'", str19, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor2.getType();
        java.lang.String str7 = visitor2.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
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
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        java.lang.Class<?> wildcardClass14 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor9.getType();
        java.lang.Class<?> wildcardClass13 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass15 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor11.getPassword("hi!");
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
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        java.lang.String str14 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor11.getPassword("hi!");
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
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
        java.lang.Class<?> wildcardClass10 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        java.lang.String str7 = visitor4.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("visitor", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        java.lang.String str13 = visitor9.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass15 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        java.lang.String str15 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        java.lang.String str9 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
            visitor10.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        java.lang.String str15 = visitor14.getType();
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor14);
        java.lang.Class<?> wildcardClass17 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        java.lang.Class<?> wildcardClass16 = visitor15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
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
        java.lang.String str10 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.String str12 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("", "", "visitor");
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
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        java.lang.String str7 = visitor3.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor5.getType();
        java.lang.String str9 = visitor5.getType();
        java.lang.Class<?> wildcardClass10 = visitor5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        login.Visitor visitor19 = new login.Visitor((login.Client) visitor11);
        login.Visitor visitor20 = new login.Visitor((login.Client) visitor19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.String str14 = visitor13.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor6.getType();
        java.lang.Class<?> wildcardClass8 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        java.lang.String str10 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor13.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        java.lang.Class<?> wildcardClass14 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
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
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor11.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
        java.lang.String str12 = visitor11.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        java.lang.String str14 = visitor13.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor1.getType();
        java.lang.String str5 = visitor1.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = visitor1.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor14.register("", "hi!", "hi!");
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
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor1.getType();
        java.lang.String str4 = visitor1.getType();
        java.lang.Class<?> wildcardClass5 = visitor1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
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
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
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
            java.lang.String str16 = visitor14.getPassword("hi!");
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
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = visitor11.getPassword("visitor");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        java.lang.String str14 = visitor7.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor7);
        java.lang.Class<?> wildcardClass16 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        java.lang.Class<?> wildcardClass14 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
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
            visitor12.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        // The following exception was thrown during execution in test generation
        try {
            visitor14.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
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
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        java.lang.String str13 = visitor12.getType();
        java.lang.String str14 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        login.Visitor visitor20 = new login.Visitor((login.Client) visitor18);
        login.Visitor visitor21 = new login.Visitor((login.Client) visitor18);
        login.Visitor visitor22 = new login.Visitor((login.Client) visitor18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "visitor" + "'", str19, "visitor");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        java.lang.Class<?> wildcardClass11 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor3.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
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
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "hi!", "hi!");
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
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
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
        java.lang.String str11 = visitor10.getType();
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
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
            visitor7.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        java.lang.String str12 = visitor8.getType();
        java.lang.String str13 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor5.getType();
        java.lang.String str9 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
            visitor8.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
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
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        java.lang.String str12 = visitor2.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor2);
        java.lang.String str14 = visitor2.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        java.lang.String str10 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
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
        java.lang.String str10 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        java.lang.String str12 = visitor4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        java.lang.String str10 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("", "hi!", "hi!");
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
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass11 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
        java.lang.String str13 = visitor9.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = visitor2.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        java.lang.String str10 = visitor4.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("visitor", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.String str9 = visitor2.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        java.lang.String str12 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
        java.lang.String str20 = visitor19.getType();
        login.Visitor visitor21 = new login.Visitor((login.Client) visitor19);
        // The following exception was thrown during execution in test generation
        try {
            visitor19.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "visitor" + "'", str20, "visitor");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = visitor3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
            java.lang.String str14 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor6.getType();
        java.lang.String str11 = visitor6.getType();
        java.lang.String str12 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        java.lang.String str14 = visitor12.getType();
        java.lang.Class<?> wildcardClass15 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        java.lang.String str7 = visitor2.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor2);
        java.lang.Class<?> wildcardClass9 = visitor2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor2.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
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
        java.lang.String str11 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        java.lang.String str11 = visitor10.getType();
        java.lang.String str12 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        java.lang.String str10 = visitor7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
            visitor12.register("visitor", "", "visitor");
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
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
            visitor5.register("visitor", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
        java.lang.String str13 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        java.lang.String str13 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
        java.lang.String str17 = visitor15.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor15.register("hi!", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "visitor" + "'", str17, "visitor");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = visitor16.getPassword("hi!");
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
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
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
        java.lang.String str11 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor7.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        java.lang.Class<?> wildcardClass10 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor3.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        java.lang.String str12 = visitor11.getType();
        java.lang.Class<?> wildcardClass13 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = visitor7.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        java.lang.String str10 = visitor7.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
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
        java.lang.String str13 = visitor4.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor4);
        java.lang.Class<?> wildcardClass15 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
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
            java.lang.String str17 = visitor11.getPassword("");
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
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
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
        java.lang.Class<?> wildcardClass15 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
        java.lang.String str14 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        java.lang.String str9 = visitor6.getType();
        java.lang.String str10 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
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
            visitor10.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
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
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass11 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("visitor", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
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
        java.lang.String str13 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
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
            java.lang.String str13 = visitor10.getPassword("hi!");
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
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
        java.lang.String str12 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
        java.lang.String str12 = visitor10.getType();
        java.lang.String str13 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        java.lang.String str12 = visitor9.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("hi!", "hi!", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        java.lang.String str5 = visitor3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = visitor3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor5.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        java.lang.Class<?> wildcardClass10 = visitor3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor12);
        java.lang.String str16 = visitor12.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor11.getPassword("hi!");
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
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        java.lang.Class<?> wildcardClass12 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = visitor5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor2.getType();
        java.lang.String str8 = visitor2.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor2.getPassword("visitor");
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
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
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
        java.lang.Class<?> wildcardClass12 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
            visitor13.register("", "hi!", "");
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
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        java.lang.String str8 = visitor7.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = visitor13.getPassword("hi!");
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
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor8.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.Class<?> wildcardClass8 = visitor7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        java.lang.String str10 = visitor8.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
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
        java.lang.String str13 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor9.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor6);
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "visitor", "hi!");
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
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
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
        java.lang.String str11 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("visitor", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
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
        java.lang.String str14 = visitor13.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        java.lang.String str16 = visitor15.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor15.register("visitor", "", "");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        java.lang.String str11 = visitor8.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        java.lang.String str12 = visitor2.getType();
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("", "visitor", "visitor");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = visitor11.getPassword("");
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
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        java.lang.String str6 = visitor2.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor2);
        java.lang.String str8 = visitor2.getType();
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor13);
        // The following exception was thrown during execution in test generation
        try {
            visitor13.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
        java.lang.String str15 = visitor14.getType();
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor14);
        java.lang.Class<?> wildcardClass17 = visitor16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
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
        java.lang.String str14 = visitor9.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor11.register("", "", "");
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
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = visitor7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        java.lang.Class<?> wildcardClass12 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
            java.lang.String str13 = visitor9.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
        java.lang.String str16 = visitor15.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor15.register("visitor", "", "");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        java.lang.String str10 = visitor9.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass16 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        java.lang.String str2 = visitor1.getType();
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "visitor" + "'", str2, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor8.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
            java.lang.String str14 = visitor11.getPassword("");
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
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("visitor", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = visitor4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
            java.lang.String str12 = visitor8.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
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
        java.lang.String str15 = visitor12.getType();
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor12);
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor5.getType();
        java.lang.String str7 = visitor5.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor5);
        java.lang.String str10 = visitor5.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor5);
        java.lang.String str13 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor12.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor3.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = visitor6.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        // The following exception was thrown during execution in test generation
        try {
            visitor3.register("hi!", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("visitor", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
            visitor14.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
            visitor11.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        java.lang.String str10 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor9.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        java.lang.String str9 = visitor6.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        java.lang.String str11 = visitor10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.Class<?> wildcardClass15 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor5.getType();
        java.lang.String str8 = visitor5.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = visitor5.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        java.lang.String str12 = visitor11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = visitor11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        java.lang.String str5 = visitor3.getType();
        java.lang.String str6 = visitor3.getType();
        java.lang.String str7 = visitor3.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
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
        java.lang.String str11 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
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
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        java.lang.Class<?> wildcardClass12 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
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
        java.lang.String str20 = visitor17.getType();
        login.Visitor visitor21 = new login.Visitor((login.Client) visitor17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = visitor21.getPassword("visitor");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "visitor" + "'", str20, "visitor");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        java.lang.Class<?> wildcardClass11 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = visitor12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
            visitor8.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
        java.lang.String str10 = visitor9.getType();
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor9);
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
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
        login.Visitor visitor19 = new login.Visitor((login.Client) visitor11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = visitor19.getPassword("hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "visitor" + "'", str18, "visitor");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        java.lang.Class<?> wildcardClass12 = visitor10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = visitor14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
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
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor3);
        java.lang.String str12 = visitor3.getType();
        java.lang.Class<?> wildcardClass13 = visitor3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        java.lang.String str13 = visitor9.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor9);
        // The following exception was thrown during execution in test generation
        try {
            visitor14.register("visitor", "hi!", "visitor");
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
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        java.lang.String str10 = visitor6.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor1);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        // The following exception was thrown during execution in test generation
        try {
            visitor7.register("visitor", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        java.lang.String str6 = visitor4.getType();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        java.lang.String str4 = visitor2.getType();
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor7);
        java.lang.String str9 = visitor8.getType();
        java.lang.String str10 = visitor8.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            visitor4.register("visitor", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        // The following exception was thrown during execution in test generation
        try {
            visitor5.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor14);
        java.lang.Class<?> wildcardClass16 = visitor14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor13);
        java.lang.String str15 = visitor14.getType();
        java.lang.String str16 = visitor14.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
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
        login.Visitor visitor16 = new login.Visitor((login.Client) visitor15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
            visitor5.register("", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
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
            java.lang.String str15 = visitor13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor12);
        java.lang.Class<?> wildcardClass16 = visitor15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor6);
        java.lang.String str9 = visitor6.getType();
        java.lang.String str10 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("visitor", "", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor6.register("hi!", "visitor", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor4.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = visitor4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        java.lang.String str4 = visitor3.getType();
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        java.lang.Class<?> wildcardClass9 = visitor6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        java.lang.String str5 = visitor2.getType();
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor2);
        java.lang.String str7 = visitor6.getType();
        java.lang.String str8 = visitor6.getType();
        java.lang.String str9 = visitor6.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor6);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor6);
        java.lang.String str12 = visitor11.getType();
        java.lang.String str13 = visitor11.getType();
        java.lang.Class<?> wildcardClass14 = visitor11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
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
            java.lang.String str11 = visitor5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = visitor11.getPassword("");
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
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor4);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor10.register("", "visitor", "visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
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
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor8);
        java.lang.String str13 = visitor12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = visitor12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        // The following exception was thrown during execution in test generation
        try {
            visitor2.register("visitor", "hi!", "");
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
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        java.lang.String str10 = visitor9.getType();
        java.lang.String str11 = visitor9.getType();
        login.Visitor visitor12 = new login.Visitor((login.Client) visitor9);
        java.lang.String str13 = visitor9.getType();
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor(client0);
        login.Visitor visitor3 = new login.Visitor(client0);
        java.lang.String str4 = visitor3.getType();
        // The following exception was thrown during execution in test generation
        try {
            visitor3.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
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
        java.lang.String str12 = visitor10.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
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
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = visitor8.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
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
        java.lang.String str14 = visitor12.getType();
        login.Visitor visitor15 = new login.Visitor((login.Client) visitor12);
        java.lang.String str16 = visitor12.getType();
        login.Visitor visitor17 = new login.Visitor((login.Client) visitor12);
        login.Visitor visitor18 = new login.Visitor((login.Client) visitor17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "visitor" + "'", str14, "visitor");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "visitor" + "'", str16, "visitor");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
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
        java.lang.Class<?> wildcardClass10 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "visitor" + "'", str4, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
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
            visitor20.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        java.lang.String str3 = visitor2.getType();
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor6 = new login.Visitor((login.Client) visitor5);
        login.Visitor visitor7 = new login.Visitor((login.Client) visitor6);
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = visitor7.getType();
        login.Visitor visitor10 = new login.Visitor((login.Client) visitor7);
        login.Visitor visitor11 = new login.Visitor((login.Client) visitor10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = visitor10.getPassword("visitor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor11);
        java.lang.String str15 = visitor11.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "visitor" + "'", str13, "visitor");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "visitor" + "'", str15, "visitor");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
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
        java.lang.Class<?> wildcardClass13 = visitor4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "visitor" + "'", str10, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        java.lang.Class<?> wildcardClass10 = visitor8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
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
        login.Visitor visitor14 = new login.Visitor((login.Client) visitor12);
        java.lang.Class<?> wildcardClass15 = visitor12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
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
        java.lang.String str11 = visitor9.getType();
        java.lang.Class<?> wildcardClass12 = visitor9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "visitor" + "'", str5, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "visitor" + "'", str11, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        login.Client client0 = null;
        login.Visitor visitor1 = new login.Visitor(client0);
        login.Visitor visitor2 = new login.Visitor((login.Client) visitor1);
        login.Visitor visitor3 = new login.Visitor((login.Client) visitor2);
        login.Visitor visitor4 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor5 = new login.Visitor((login.Client) visitor3);
        java.lang.String str6 = visitor3.getType();
        java.lang.String str7 = visitor3.getType();
        login.Visitor visitor8 = new login.Visitor((login.Client) visitor3);
        login.Visitor visitor9 = new login.Visitor((login.Client) visitor8);
        // The following exception was thrown during execution in test generation
        try {
            visitor8.register("hi!", "visitor", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "visitor" + "'", str6, "visitor");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "visitor" + "'", str7, "visitor");
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
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
        login.Visitor visitor13 = new login.Visitor((login.Client) visitor4);
        java.lang.Class<?> wildcardClass14 = visitor13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "visitor" + "'", str3, "visitor");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "visitor" + "'", str8, "visitor");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "visitor" + "'", str9, "visitor");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "visitor" + "'", str12, "visitor");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}
